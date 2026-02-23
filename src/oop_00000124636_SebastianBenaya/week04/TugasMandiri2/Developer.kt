package oop_00000124636_SebastianBenaya.week04.TugasMandiri2

class Developer (name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}