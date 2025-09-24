open class Room {
    open var tableList: List<Table> = listOf(Table())
    open var chairList: List<Chair> = listOf(Chair())
    open var CSStaff: Staff = Staff()

    open fun addTable(table: Table) {}
    open fun addChair(chair: Chair) {}

    open fun showTable(): List<Table> {
        return tableList
    }

    open fun showChair(): List<Chair> {
        return chairList
    }
}