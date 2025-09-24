open class Course() {
    var studentList: List<Student> = listOf()
    var teacherList: List<Teacher> = listOf()
    var subjects: List<Subject> = listOf()

    fun addStudent(student: Student) {
        studentList = studentList.plus(student)
    }

    fun addTeacher(teacher: Teacher) {
        teacherList = teacherList.plus(teacher)
    }

    fun addSubject(subject: Subject) {
        subjects = subjects.plus(subject)
    }
}