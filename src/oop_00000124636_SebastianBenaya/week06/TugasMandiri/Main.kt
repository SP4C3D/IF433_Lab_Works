package oop_00000124636_SebastianBenaya.week06.TugasMandiri

fun main(){
    val sl1 = SmartLamp("1", "Ruang Tamu")
    val ss1 = SmartSpeaker("1", "Google Nest Dapur")
    val cctv1 = SmartCCTV("1", "Ezviz Garasi")
    val hub = SmartHomeHub()
    hub.addDevice(sl1)
    hub.addDevice(ss1)
    hub.addDevice(cctv1)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}