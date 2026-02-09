package oop_00000124636_SebastianBenaya.week02.tugasmandiri2

class Hero(val name: String, var hp: Int, val baseDamage: Int){
    constructor(name: String, baseDamage: Int) : this(name, hp = 100, baseDamage)
    fun attack(targetName: String){
        println("$name menyerang $targetName dengan senjatanya")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if(hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return if(hp > 0) true
        else false
    }
}