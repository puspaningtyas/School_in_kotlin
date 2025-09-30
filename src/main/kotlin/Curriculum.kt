class Curriculum(
    var subjectList: MutableList<Subject> = mutableListOf()
) {

    fun addSubject(subject: Subject) {
        subjectList.add(subject)
    }


    fun removeSubject(subject: Subject) {
        subjectList.remove(subject)
    }


    fun showSubjects() {
        println("Daftar Subject dalam Curriculum:")
        subjectList.forEach { println("- ${it.name}") }
    }
}