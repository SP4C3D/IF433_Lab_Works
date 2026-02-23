package oop_00000124636_SebastianBenaya.week04.TugasMandiri2

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}