class Staff(
    override val name: String,
    override val age: Int,
    override val gender: String,
    var position: String
) : Person(name, age, gender) {

}
