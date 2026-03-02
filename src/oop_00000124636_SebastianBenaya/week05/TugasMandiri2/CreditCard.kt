package oop_00000124636_SebastianBenaya.week05.TugasMandiri2

class CreditCard (val limit: Double, var usedAmount: Double = 0.0, accountName: String): PaymentMethod (accountName){
    override fun processPayment(amount: Double) {
        if(usedAmount + amount < limit){
            usedAmount += amount
            println("Pembayaran dengan credit card berhasil. Jumlah limit yang digunakan: $usedAmount")
        } else {
            println("Pembayaran gagal, pembayaran anda diatas limit")
        }
    }
}