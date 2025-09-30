class TeacherBoard {
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
            teacherList.forEach { println("- ${it.name}, umur ${it.age}, gender ${it.gender}") }

        }
    }

}