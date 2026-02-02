package oop_00000124636_SebastianBenaya.week01

fun main(){
    val gameTitle: String = "Forza Horizon 6"
    val price: Int = 900000
    val userNote: String? = null
    printReceipt(title = gameTitle, finalPrice = price)
    println(userNote?: "Tidak ada catatan")
}

fun calculateDiscount(price: Int): Int {
    if (price > 500000) {
        return (price * 0.8).toInt()
    } else {
        return (price * 0.7).toInt()
    }
}

fun printReceipt(title: String, finalPrice: Int) {
    println("Game yang dibeli: $title\nHarga awal: $finalPrice\nHarga akhir: ${calculateDiscount(finalPrice)}")
}