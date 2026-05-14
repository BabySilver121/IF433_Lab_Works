package oop_108111_FigoBarosky.week11

fun main() {

    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(
        "Philips WiZ Living Room",
        "Lighting",
        true,
        12
    ).apply {

    }.also {
        homeDevices.add(it)
    }
}