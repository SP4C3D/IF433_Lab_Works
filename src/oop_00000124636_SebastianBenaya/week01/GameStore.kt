package oop_00000124636_SebastianBenaya.week01

fun main(){
    val gameTitle: String
    val price: Int
}

fun calculateDiscount(price: Int): Int{
    if(price > 500000) {
        return price - (2 / 10 * price)
    } else {
        return price - (1 / 10 * price)
    }
}