package oop_108111_FigoBarosky.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 20) / 100
    else (price * 10) / 100
