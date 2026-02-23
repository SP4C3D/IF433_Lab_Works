package oop_00000124636_SebastianBenaya.week04.TugasMandiri1

import oop_00000124636_SebastianBenaya.week04.Car

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors){
    final override fun accelerate() {
        speed += 10
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}