interface First{
    var engine: Int
    val color: String
    val door: Int
    fun dDrive():Int
    fun rDrive():Int
    fun bbreak():Int
}
interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
    override fun foo() { print("overrided method") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}