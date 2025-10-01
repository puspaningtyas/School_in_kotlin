class Room {
    var tableList = arrayListOf<Table>()
    var chairList = arrayListOf<Chair>()
    var csStaff: Staff? = null

    fun addTable(table: Table) {
        tableList.add(table)
    }

    fun removeTable(table: Table) {
        tableList.remove(table)
    }

    fun addChair(chair: Chair) {
        chairList.add(chair)
    }

    fun removeChair(chair: Chair) {
        chairList.remove(chair)
    }

    // Assign staff
    fun assignStaff(staff: Staff) {
        csStaff = staff
        println("Staff ${staff.name} ditugaskan ke Room ini.")
    }

    fun showRoomInfo() {
        println("=== Informasi Room ===")
        println("Jumlah meja: ${tableList.size}")
        println("Jumlah kursi: ${chairList.size}")
        println("Staff CS: ${csStaff?.name ?: "(Belum ada staff)"}")
    }
}
