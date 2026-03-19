package oop_108111_FigoBarosky.week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}