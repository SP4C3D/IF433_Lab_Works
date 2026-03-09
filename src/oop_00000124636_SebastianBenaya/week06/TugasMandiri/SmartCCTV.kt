package oop_00000124636_SebastianBenaya.week06.TugasMandiri

class SmartCCTV(override val id: String, override val name:String): SmartDevice, Switchable, Recordable{
    override fun turnOn() {
        println("CCTV $name berhasil dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name berhasil dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }
}