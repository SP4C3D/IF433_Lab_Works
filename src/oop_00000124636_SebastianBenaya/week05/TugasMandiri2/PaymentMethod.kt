package oop_00000124636_SebastianBenaya.week05.TugasMandiri2

abstract class PaymentMethod (val accountName: String){
    abstract fun processPayment(amount: Double)
}