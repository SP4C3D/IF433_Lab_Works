package oop_00000124636_SebastianBenaya.week14.tugasmandiri

import oop_00000124636_SebastianBenaya.week08.Order
import oop_00000124636_SebastianBenaya.week14.DiscountStrategy
import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName telah dikonfirmasi!")
    }
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.bufferedWriter().use { writer ->
            file.appendText("$itemName, $finalPrice, $customerType\n")
        }
    }
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.9
    }
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService) {
    fun processOrder(itemName: String, basePrice: Double, strategy: PricingStrategy, customerType: String){
        val finalPrice = strategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}