package oop_108111_FigoBarosky.week03

class Weapon(
    val name: String, // Read-only
    damage: Int
) {

    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh negatif!")
                return
            }

            if (value > 1000) {
                println("Damage tidak boleh lebih dari 1000! Diset ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}