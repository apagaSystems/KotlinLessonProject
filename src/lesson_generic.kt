class Generic<T, E>(item: T, element: E) {
    private var look: T = item
     var el: E = element

    fun generic(): T? {

        return look
    }
    fun nextGen()=el

}
