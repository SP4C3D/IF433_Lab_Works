package oop_00000124636_SebastianBenaya.week01

fun main(){
    val gameTitle: String = "Forza Horizon 6"
    val price: Int = 900000
}

fun calculateDiscount(price: Int): Int {
    if (price > 500000) {
        return (price * 0.8).toInt()
    } else {
        return (price * 0.7).toInt()
    }
}