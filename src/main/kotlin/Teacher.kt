class Teacher(
    override val name: String,
    override val age: Int,
    override val gender: String,
    val subject: String
) : Person(name, age, gender)
