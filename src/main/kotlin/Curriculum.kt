class Curriculum {
//}
// Definisi Subject
class Subject(val name: String)

    // Definisi Curriculum
    class Curriculum(
        var subjectList: MutableList<Subject> = mutableListOf()
    ) {
        // Tambah subject baru ke dalam kurikulum
        fun addSubject(subject: Subject) {
            subjectList.add(subject)
        }

        // Hapus subject dari kurikulum
        fun removeSubject(subject: Subject) {
            subjectList.remove(subject)
        }

        // Tampilkan semua subject dalam kurikulum
        fun showSubjects() {
            println("Daftar Subject dalam Curriculum:")
            subjectList.forEach { println("- ${it.name}") }
        }
    }

}