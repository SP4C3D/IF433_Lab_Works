package oop_00000124636_SebastianBenaya.week14

interface MultifunctionDevice {
    fun print(doc: String)
    fun scan(doc: String): String
    fun fax(doc: String)
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing: $doc")
}