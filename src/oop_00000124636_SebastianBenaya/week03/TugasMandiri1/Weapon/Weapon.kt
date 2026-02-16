package oop_00000124636_SebastianBenaya.week03.TugasMandiri1.Weapon

class Weapon(val name: String) {
    var damage: Int = 67
        set(value){
            if(value < 0){
                println("Error, damage tidak boleh negatif. Damage telah di set kembali ke default (67)")
                field = 0
            }else if(value > 1000){
                println("Tidak boleh overpowered, you are not him. Damage telah di set ke maksimum 1000")
                field = 1000
            }
        }
    val tier: String
        get(){
            return if(damage > 800) "Legendary"
            else if (damage > 500) "Epic"
            else "Common"
        }
}