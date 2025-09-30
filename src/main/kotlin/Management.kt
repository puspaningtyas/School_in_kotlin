class Management {
    class Teacher(
        val name: String,
        val subject: String
    )


    class Staff(
        val name: String,
        val division: String
    )


    class Manajemen(
        val principal: Teacher,
        val managerList: MutableList<Teacher>,
        val fieldManager: Staff
    ) {

        fun addManager(manager: Teacher) {
            managerList.add(manager)
        }


        fun showDetail() {
            println("=== Struktur Manajemen ===")
            println("Principal : ${principal.name}, Mata Pelajaran: ${principal.subject}")

            println("\nDaftar Manager:")
            managerList.forEachIndexed { index, manager ->
                println("${index + 1}. ${manager.name} - ${manager.subject}")
            }

            println("\nField Manager : ${fieldManager.name}, Divisi: ${fieldManager.division}")
        }
    }

}
