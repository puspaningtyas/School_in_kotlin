class Management(
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

        }
    }


