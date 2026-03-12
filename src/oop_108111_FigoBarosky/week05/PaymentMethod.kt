package oop_108111_FigoBarosky.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}