class Subject {
}// Class Subject
class Subject(
    val id: String,        // Kode mata kuliah, contoh: "MAT101"
    val name: String,      // Nama mata kuliah, contoh: "Matematika Dasar"
    val credit: Int,       // Jumlah SKS
    val description: String? = null  // Deskripsi opsional
) {

    // Method untuk menampilkan informasi Subject
    fun printInfo() {
        println("Kode: $id")
        println("Nama: $name")
        println("SKS: $credit")
        if (description != null) {
            println("Deskripsi: $description")
        }
    }
}
