package oop_00000124636_SebastianBenaya.week05.TugasMandiri2

fun main(){
    val gopayBen = EWallet(50000.0, "benGP")
    val bcaBen = CreditCard(100000.0, accountName = "benCC")

    val pembayaran: List<PaymentMethod> = listOf(gopayBen, bcaBen)

    for(paymentMethod in pembayaran){
        paymentMethod.processPayment(75000.0)
    }
}