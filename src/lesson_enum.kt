// enum, when կիրառությունը
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b



    fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Dirty color")
        }

}

enum class Lang(val r: Int, val g: Int, val b: Int) {
    JAVA(255, 0, 0),
    KOTLIN(255, 165, 0),
    CSARP(255, 255, 0),
    PHP(0, 255, 0),
    PYTHON(0, 0, 255);



    fun maxRating():Int {

        return 45
    }


}