package oop_00000124636_SebastianBenaya.week11.tugasMandiri

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    val lampu1 = SmartDevice(name = "Philips WiZ Living Room", category = "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also { homeDevices.add(it) }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also{
        homeDevices.add(it)
        println("(LOG) Kamera terhubung")
    }

    val ac1 = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800).run {
        homeDevices.add(this)
        this
    }

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find {it.category == "Camera"}

    searchResult?.let {
        println("Terdeteksi kamera: ")
        println(it.diagnose())
    }
}