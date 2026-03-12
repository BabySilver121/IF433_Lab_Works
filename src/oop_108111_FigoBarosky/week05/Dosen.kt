package oop_108111_FigoBarosky.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {

    // Override fungsi bekerja()
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // Fungsi khusus dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}