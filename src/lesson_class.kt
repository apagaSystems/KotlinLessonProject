open class Test {
    protected open val num = 45
    open fun printer() = "print class Test"
}

class Next : Test() {
    override val num = super.num * 4
    override fun printer() = "print class Next and $num"

    companion object { // companion օբյեկտներին կարելի է դիմել կասսի անունով,
        // առանց օբյեկտ հայտարարելու
        fun testMethod(): String {
            return "companion object from Next class"
        }

        fun testMethod1(): String {
            return "companion object from Next class"
        }
    }

    val NextObj = Next()
    val obj = NextObj.printer()

    val abc = testMethod()
    val abcd = Next.testMethod1()


    val testObject = object : Test() {

        override fun printer() = "Անանուն կլասս"
    }

    fun anu(isReversed: Boolean = false) = if (isReversed) testObject.printer().reversed()
    else testObject.printer()

}

data class ColorData(val red: Int, val green: Int, val blue: Int) {
    fun color(): Int {
        return (red + green + blue) / 3
    }


}

open class Car : First {
    override var engine: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override val color: String
        get() = TODO("Not yet implemented")
    override val door: Int
        get() = TODO("Not yet implemented")

    override fun dDrive(): Int {
        TODO("Not yet implemented")
    }

    override fun rDrive(): Int {
        TODO("Not yet implemented")
    }

    override fun bbreak(): Int {
        TODO("Not yet implemented")
    }


}

abstract class Genesis() {

}

class SecondClass : Genesis() {}

class One(val name: String) // short type
class Second { // via secondary constructor
    val name: String

    constructor(name: String) {
        this.name = name
    }

    init {
        // block init
    }
}

class Thred(_name: String) {
    val name = _name
}

class Mama(val a: Int) {

    class Nested {
        fun nested() = "I am nested class"
    }

    inner class Inner {}
}


// inner and nested class
val mama = Mama(123)
val inn = mama.Inner()
val inner = Mama(456).Inner()

val nested = Mama.Nested()

