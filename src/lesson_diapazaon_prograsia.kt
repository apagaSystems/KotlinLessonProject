fun isLetter(ch: Char) = ch in 'a'..'z' || ch in 'A'..'Z'
fun isNotDigit(ch: Char) = ch !in '0'..'9'

fun cond(a: Int, b: Int) {
    val point = if (a > b) "ok" else "Not!!"
    val next_1 = if (a in 0..10) "OK" else "Not" // 1-10 ներառյալ
    val next_2 = if (a in 100 downTo 10) "OK" else "Not" // նվազող
    val next_3 = if (a in 0 until 100) "OK" else "Not"// 1-99
    val next_4 = when (b) {
        10 -> "10"
        in 20..50 -> "20-50"
        in 50 until 100 -> "50-100"
        else -> "Incorrect number" //throw Exception("Incorrect number")
    }
}