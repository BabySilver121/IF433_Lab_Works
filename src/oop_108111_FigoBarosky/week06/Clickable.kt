package oop_108111_FigoBarosky.week06

package oop_108111_FigoBarosky.week06

interface Clickable {

    // ERROR: tidak boleh ada backing field di interface
    val name: String = "Tombol Rahasia"

    fun click()
}