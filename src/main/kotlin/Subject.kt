class Subject(
    val id: String,
    val name: String,
    val sks: Int,
    val description: String? = null
) {
    fun printInfo() {
        println("Kode: $id")
        println("Nama: $name")
        println("SKS: $sks")
        if (description != null) {
            println("Deskripsi: $description")
        }
    }
}
