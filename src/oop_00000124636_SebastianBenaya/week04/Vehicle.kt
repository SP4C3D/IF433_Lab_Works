package oop_00000124636_SebastianBenaya.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaku. Kecepatan: $speed km/jam")
    }

    open fun honk(){
        println("Beep beep!")
    }
}