class Student(
    name: String,
    age: Int,
    val studentId: String,
    val major: String
) : Person(name, age) {

    fun showInfo() {
        println("Student: $name, Age: $age, ID: $studentId, Major: $major")
    }
}