package oop_00000124636_SebastianBenaya.week03.TugasMandiri

class Player(val Username: String, private var xp: Int = 0){
    var level: Int = 0
        get(){
            return (xp / 100) + 1
        }
    fun addXp(amount: Int): Any {
        if(xp < 0){
            println("Error, xp tidak boleh negatif.")
        }else{
            var levelCheck = level
            xp += amount
            if(level > levelCheck){
                println("Level Up! Selamat $Username naik ke level $level")
            }
        }
        return xp
    }
}