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

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService) : OrderRepository {

}