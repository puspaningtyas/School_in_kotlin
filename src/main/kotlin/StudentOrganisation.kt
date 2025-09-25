data class Student(val studentName: String)

class StudentOrganisation(
    var name: String,
    var advisor: String
) {
    private val leaders: MutableList<Student> = mutableListOf()

    fun addLeader(student: Student) {
        leaders.add(student)
    }

    fun removeLeader(student: Student) {
        leaders.remove(student)
    }

    fun getLeaders(): List<Student> {
        return leaders
    }
}