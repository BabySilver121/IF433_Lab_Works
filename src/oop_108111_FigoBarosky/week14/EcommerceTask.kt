package oop_108111_FigoBarosky.week14

import java.io.File

interface OrderRepository {
    fun saveOrder(data: String)
}

class CsvOrderRepository : OrderRepository {

    private val file = File("orders.csv")

    override fun saveOrder(data: String) {
        file.printWriter().use {
            it.println(data)
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("EMAIL: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String
    ) {

        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        repo.saveOrder("$itemName,$finalPrice,$customerType")

        notifier.sendNotification(
            "Pesanan $itemName telah dikonfirmasi"
        )
    }
}