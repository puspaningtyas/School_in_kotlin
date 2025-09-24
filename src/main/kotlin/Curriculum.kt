open class Curriculum {
    open var subjectList:List<Subject> = listOf(Subject("Curriculum"))

    fun showSubjectList(): List<Subject>{
        return subjectList
    }
}