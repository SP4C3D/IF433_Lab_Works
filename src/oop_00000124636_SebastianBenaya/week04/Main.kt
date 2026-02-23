package oop_00000124636_SebastianBenaya.week04

import oop_00000124636_SebastianBenaya.week04.TugasMandiri1.ElectricCar

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Car ---")
    val myCar2 = ElectricCar("Hyundai", 4, 67)
    myCar2.accelerate()
    myCar2.honk()
    myCar2.openTrunk()

}