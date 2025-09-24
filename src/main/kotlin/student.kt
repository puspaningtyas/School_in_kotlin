class Student(
    name: String?,
    address: String?,
    val studentId: String?,
    val semester: Int
) : Person(name, address) {

    fun study() {
        println("$name is studying...")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Student ID : $studentId")
        println("Semester   : $semester")
    }
}
