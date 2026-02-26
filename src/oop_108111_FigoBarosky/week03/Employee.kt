package oop_108111_FigoBarosky.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    // PRIVATE PROPERTY
    private var performanceRating: Int = 3

    // FUNCTION untuk ubah rating
    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    // FUNCTION untuk lihat status
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}