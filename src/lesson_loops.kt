fun loopFor1() {
    for (i in 1..10) {
        println(i)
    }
}

fun loopFor2() {
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}

fun loopFor3() {
    for (i in 0 until 12 step 2) {
        println(i)
        if (i == 6) return
    }
}

fun loopFor4() {
    for (i in 'a'..'z') {
        println(i)
    }
}

fun loopFor5() {
    for (i in "abcdef") {
        println(i)
    }
}

fun loopFor6() {
    loop6@ for (i in 0 until 8 ) {
        for (j in 0 until 8 step 2) {
            println(j)
            println(i)
            if (j == 4 && i==3) break@loop6
        }
    }
}

fun loopFor7() {
    "abcdef".forEach {
        println(it) }


}