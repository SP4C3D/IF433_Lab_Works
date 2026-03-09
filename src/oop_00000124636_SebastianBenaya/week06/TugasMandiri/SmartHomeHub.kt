package oop_00000124636_SebastianBenaya.week06.TugasMandiri

class SmartHomeHub (){
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {}
    fun turnOffAllSwitches(){
        for (device in devices) {
            if(device is Switchable) {device.turnOff()}
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            if(device is Recordable) {device.startRecord()}
            if(device is SmartSpeaker) {device.playMusic("Sirine Peringatan")}
        }
    }
}