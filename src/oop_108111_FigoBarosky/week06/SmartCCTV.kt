package oop_108111_FigoBarosky.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name menyala.")
        startRecord()
    }

    override fun turnOff() {
        println("$name mati.")
    }

    override fun startRecord() {
        println("$name mulai merekam.")
    }
}