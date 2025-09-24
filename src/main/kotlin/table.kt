class table (
    val id: Int,
    val material: String,
    val length: Double,
    val width: Double,
    val height: Double
) {
    fun getSurefaceArea(): Double{
        return length * width
    }

    override fun toString(): String {
        return "Table(id=$id, material='$material', size=${length}x${width}x$height)"
    }
}
