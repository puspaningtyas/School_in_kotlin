class Course(
    val subject: Subject,
    val studentList: MutableList<Student> = mutableListOf(),
    val teacherList: MutableList<Teacher> = mutableListOf()
) {
    fun addStudent(student: Student) {
        studentList.add(student)
    }

    fun removeStudent(student: Student) {
        studentList.remove(student)
    }

    fun addTeacher(teacher: Teacher) {
        teacherList.add(teacher)
    }

    fun removeTeacher(teacher: Teacher) {
        teacherList.remove(teacher)
    }

    fun showCourseInfo() {
        println("Mata Kuliah: ${subject.name}")


        println("Daftar Guru:")
        if (teacherList.isEmpty()) println("- (Belum ada guru)")
        else teacherList.forEach { println("- ${it.name}, umur ${it.age}, gender ${it.gender}") }

        println("Daftar Mahasiswa:")
        if (studentList.isEmpty()) println("- (Belum ada mahasiswa)")
        else studentList.forEach { println("- ${it.name} (ID: ${it.studentId})") }
    }
}