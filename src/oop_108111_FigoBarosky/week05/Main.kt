package oop_108111_FigoBarosky.week05

fun main() {

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        // Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting
        when (pegawai) {

            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("-----------------------------")

    }

    println("=== TEST MATH HELPER ===")

    val math = MathHelper()

    println("Luas Persegi (4) = ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang (4,5) = ${math.hitungLuas(4,5)}")
    println("Luas Lingkaran (3.5) = ${math.hitungLuas(3.5)}")
}