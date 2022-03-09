fun main(args: Array<String>) {
    val num = 5
    val numList = arrayListOf<Int>(2, 5, 8, 9, 7, 88, 11)
    println(numList.filter(::isPrime))
    println(numList.all { it > 2 })
}


fun summ(x: Int, y: Int): Int {
    var alfa: Int                          // Փոփոխականի հայտարարում նշելով տիպը
    var betta = y                          // Փոփոխականի հայտարարում առանց տիպը նշելու
    alfa = x
    val number = 5                         // Հաստատունի հայտարարում  առանց տիպը նշելու
    val massage: String                     // Հաստատունի հայտարարում նշելով տիպը
    return (alfa + betta) * number

}

infix fun Int.cube(num: Int) = num * num * num

fun print() {
    println("ok")
}

fun maximum(x: Int, y: Int): Int {
    return if (x > y) x else y            // if վերադարձնում է արժեք
}

fun minimum(x: Int, y: Int) = if (x < y) x else y

fun isPrime(n: Int): Boolean {
    for (i in 2 until n) {
        if (n % i == 0)
            return false
    }
    return true
}

fun colladzLen(num: Int): Int {
    var number = num
    var count: Int
    count = 0

    while (number != 1) {
//
        if (number % 2 == 0) {
            number /= 2

            count++
        } else {
            number = 3 * number + 1
            count++
        }
    }
    return count
}

fun reciprocate(vararg values: Int) {
    println(values.toList())
}

fun foo(vararg strings: String): Int {
    return strings.size
}

//fun <E> collections.sum<T>(par: E, function:(item: T)->E){}