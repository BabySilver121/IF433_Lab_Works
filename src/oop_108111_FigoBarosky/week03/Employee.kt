package oop_108111_FigoBarosky.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // SALAH: recursive setter (akan crash)
            this.salary = value
        }
}