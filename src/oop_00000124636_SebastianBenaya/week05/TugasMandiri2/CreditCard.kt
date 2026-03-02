package oop_00000124636_SebastianBenaya.week05.TugasMandiri2

class CreditCard (val limit: Double, var usedAmount: Double, accountName: String): PaymentMethod (accountName){
    override fun processPayment(amount: Double) {
        if(usedAmount + amount > limit){
            usedAmount += amount
            println("Pembayaran berhasil")
        } else {
            println("Pembayaran gagal, pembayaran anda diatas limit")
        }
    }
}