package oop_108111_FigoBarosky.week05

class Admin(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    // Fungsi khusus admin
    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}