package oop_00000124636_SebastianBenaya.week14

class SafeDiscountCalculator(private val strategy: DiscountStrategy){
    fun calculate(price: Double) = strategy.apply(price)
}