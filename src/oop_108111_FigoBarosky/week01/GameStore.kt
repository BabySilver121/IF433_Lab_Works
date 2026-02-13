package oop_108111_FigoBarosky.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
    val userNote: String? = null
    val noteText = userNote ?: "Tidak ada catatan"

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = noteText
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 20) / 100
    else (price * 10) / 100

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: $note")
}