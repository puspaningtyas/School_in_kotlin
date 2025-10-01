class Student(
    override val name: String,
    override val age: Int,
    override val gender: String,
    val studentId: String,
    val major: String
) : Person(name, age, gender) {

    fun showInfo() {
        println("Student: $name, Age: $age, ID: $studentId, Major: $major")
    }
}
