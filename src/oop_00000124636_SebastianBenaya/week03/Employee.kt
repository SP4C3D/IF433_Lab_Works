package oop_00000124636_SebastianBenaya.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value){
            if(value < 0){
                print("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            }else{
                field = value
            }
        }
}