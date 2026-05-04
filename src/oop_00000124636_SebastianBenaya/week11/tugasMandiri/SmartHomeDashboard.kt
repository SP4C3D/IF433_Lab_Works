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
}