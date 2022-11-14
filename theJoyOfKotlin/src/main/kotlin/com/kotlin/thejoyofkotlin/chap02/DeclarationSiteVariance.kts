interface Bag<T> {
    fun get(): T
    fun use(t: T): Boolean
}

open class MyClassParent

class MyClass: MyClassParent()

class BagImpl: Bag<MyClassParent> {
    override fun get(): MyClassParent = MyClassParent()
    override fun use(t: MyClassParent): Boolean = true
}

fun useBag(bag: Bag<in MyClass>): Boolean {
    return true
}

val bag3 = useBag(BagImpl())

fun createBag(): Bag<out MyClassParent> = BagImpl2()

class BagImpl2: Bag<MyClass> {
    override fun get(): MyClass = MyClass()
    override fun use(t: MyClass): Boolean = true
}