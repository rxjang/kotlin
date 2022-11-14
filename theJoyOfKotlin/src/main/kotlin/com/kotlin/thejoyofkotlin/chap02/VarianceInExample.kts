open class MyClassParent

class MyClass: MyClassParent()

interface Bag<in T> {
    fun use(t: T): Boolean
}

class BagImpl: Bag<MyClassParent> {
    override fun use(t: MyClassParent): Boolean = true
}

val bag: Bag<MyClass> = BagImpl()