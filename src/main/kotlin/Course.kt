// Course.kt
data class Course(
    val studentList: MutableList<Student> = mutableListOf(),
    val teacherList: MutableList<Teacher> = mutableListOf(),
    val subject: Subject? = null
)