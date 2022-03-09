
fun div_test(num: Int)= try {
    val div = PI_NUM / num
    if (div != Double.POSITIVE_INFINITY) {
        "Our number is $div"
    } else {
        "Infinity"
    }

} catch (e: Exception) {
    "zeroDivision error"
}
