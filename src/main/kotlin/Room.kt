open class Room {
    open var tableList: List<Table> = listOf(Table())
    open var chariList: List<Chair> = listOf(Chair())
    open var CSStaff: Staff = Staff()

    open fun addTable(table: Table) {}
    open fun addChair(chair: Chair) {}
}