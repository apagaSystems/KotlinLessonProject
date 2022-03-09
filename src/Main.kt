import kotlin.math.PI

const val PI_NUM = 3.14
var num = 45
val ab = "HGFHGFHGF"

val nullstr: String? = null
val name = nullstr ?: "Default name"   // if nullstr= null, else name= " Default name"


fun main(args: Array<String>) {
//    println(testFun2(12))
//    println(ifExpression3("45"))
//    println(checker('a'))
//    println("This is pi number $PI_NUM, from function ${testFun1(num)}")
//    println(parsToInt(","))
//    println(multyple("45", "-9"))
//    println(length(null))
//    println(lengthNext(null))
    loopFor7()
}

fun testFun1(number: Int): Int {
    return number * number
}

fun testFun2(number: Int) = number * number

