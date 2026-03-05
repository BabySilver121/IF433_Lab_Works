package oop_108111_FigoBarosky.week04

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("tesla", 4, 100)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager("Budi", 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer("Andi", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")

}