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


    println("=== Testing Weapon ===")
    val weapon = Weapon("Excalibur", 100)

    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")
    println("Tier: ${weapon.tier}")


    println("\n=== Testing Player ===")

    val player = Player("Figo")

    // println(player.xp) // ERROR (karena private)

    player.addXp(50)   // Masih level 1
    println("Level sekarang: ${player.level}")

    player.addXp(60)   // Total 110 → Level 2
    println("Level sekarang: ${player.level}")
}