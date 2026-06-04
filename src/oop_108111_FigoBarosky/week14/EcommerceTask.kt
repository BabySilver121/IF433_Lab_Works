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

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double =
        price
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double =
        price * 0.90
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricingStrategy: PricingStrategy
    ) {

        val finalPrice =
            pricingStrategy.calculate(basePrice)

        repo.saveOrder("$itemName,$finalPrice")

        notifier.sendNotification(
            "Pesanan $itemName telah dikonfirmasi"
        )
    }
}