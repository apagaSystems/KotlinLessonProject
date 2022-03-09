fun parsToIntJavaStyle(input: String): Int? {
    try {
        return input.toInt()
    } catch (e: Exception) {
        return null
    }

}

fun parsToInt(input: String): Int? {
    return try {
        input.toInt()
    } catch (e: Exception) {
        null
    }

}

fun multyple(input1: String, input2: String) =
    if (parsToInt(input1) is Int && parsToInt(input2) is Int) input1.toInt() * input2.toInt()
    else -1

fun simbol(input1: String, input2: String) {
    if (parsToInt(input1) != null && parsToInt(input2) != null) println("$input1 $input2")
    else println("One of input is null.")
}

fun checkNull(input1: Int?) = (input1 ?: 0) * 5

fun length(obj: String?)=obj?.length?:0

fun lengthNext(obj: String?): String {
   val test=obj as? String

    return   if(test==null)"kjhlk" else  "kjghjk"
}