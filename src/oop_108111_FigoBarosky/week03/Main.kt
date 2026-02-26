package oop_108111_FigoBarosky.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Salary
    e.salary = -1000   // harus error -> 0
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // ERROR (private)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")

    val weapon = Weapon("Excalibur", 100)

    println("=== Testing Weapon ===")

    weapon.damage = -50      // Harus gagal
    println("Damage sekarang: ${weapon.damage}")

    weapon.damage = 9999     // Harus jadi 1000
    println("Damage sekarang: ${weapon.damage}")

    println("Tier: ${weapon.tier}")
}