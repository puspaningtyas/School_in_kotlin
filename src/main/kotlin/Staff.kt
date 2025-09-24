class Staff (
    name: String,
    id: String,
    var position: String
) : person(name,id){
    var assignedRoom: Room? = null
    var management: Management? = null
}