package oop_00000124636_SebastianBenaya.week04

import oop_00000124636_SebastianBenaya.week04.TugasMandiri1.ElectricCar
import oop_00000124636_SebastianBenaya.week04.TugasMandiri2.Employee
import oop_00000124636_SebastianBenaya.week04.TugasMandiri2.Manager
import oop_00000124636_SebastianBenaya.week04.TugasMandiri2.Developer

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

    println("\n--- Bekerja Bekerja Bekerja ---")
    val m1 = Manager("Josiah", 20000000)
    m1.work()
    println("Bonus yang didapat ${m1.name} adalah Rp. ${m1.calculateBonus()}")

    println("\n--- Bekerja Bekerja Bekerja ---")
    val d1 = Developer("Ben", 15670000, "Python")
    d1.work()
    println("Bonus yang didapat ${d1.name} adalah Rp. ${d1.calculateBonus()}")
}