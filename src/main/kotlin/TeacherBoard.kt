class TeacherBoard {
    open class Person(
        val name: String,
        val age: Int
    )

    class Teacher(
        name: String,
        age: Int,
        val subject: String
    ) : Person(name, age)

    class TeacherBoard(
        val teacherList: MutableList<Teacher> = mutableListOf(),
        var leader: Teacher? = null
    ) {
        fun addTeacher(teacher: Teacher) {
            teacherList.add(teacher)
        }

        fun removeTeacher(teacher: Teacher) {
            teacherList.remove(teacher)
        }

        fun assignLeader(teacher: Teacher) {
            if (teacherList.contains(teacher)) {
                leader = teacher
                println("${teacher.name} ditetapkan sebagai leader TeacherBoard.")
            } else {
                println("Guru tidak ditemukan di daftar.")
            }
        }

        fun showTeachers() {
            println("Daftar Guru di TeacherBoard:")
            teacherList.forEach { println("- ${it.name}, mengajar ${it.subject}") }
        }
    }

}