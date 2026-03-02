package oop_00000124636_SebastianBenaya.week05.TugasMandiri2

class EWallet(var balance: Double, accountName: String): PaymentMethod(accountName){
    override fun processPayment(amount: Double) {
        if(balance > amount){
            balance -= amount
            println("Pembayaran dengan E-Wallet berhasil. Sisa saldo: $balance")
        } else {
            println("Saldo E-Wallet tidak cukup")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("Saldo berhasil ditambah, saldo sekarang: ${balance}")
    }
}