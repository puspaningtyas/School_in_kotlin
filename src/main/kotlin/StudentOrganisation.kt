class StudentOrganisation {
    val leaders: MutableList<Student> = mutableListOf()
    ) {
        fun addLeader(student: Student) {
            leaders.add(student)
        }

        fun showLeaders() {
            if (leaders.isEmpty()) {
                println("Belum ada leader di organisasi ini.")
            }
            else {
                    println("Daftar Leaders StudentOrganisation:")
                    leaders.forEach { println("- ${it.name} (ID: ${it.studentId})") }
                }
            }
    }