package oop_00000124636_SebastianBenaya.week06.TugasMandiri

class SmartSpeaker(override val id: String, override val name:String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name berhasil dinyalakan.")
    }

    override fun turnOff() {
        println("Speaker $name berhasil dimatikan.")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}