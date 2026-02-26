package oop_108111_FigoBarosky.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // akan crash (StackOverflow)
}