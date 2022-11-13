import chap04Object.*

fun showAge(p: Person) = println(p.age)

fun readAge(p: Person) {
    p.age = readLine()!!.toInt()
}

fun showFullName(p: Person) = println(p.fullName())

fun main() {
    val person = Person()
    person.setName("Felix", "Lee")
    showFullName(person)

    val person2 = Person2("Felix", "Lee")
    println(person2.fullName)

    val room = Room(person2, Person2("Chris", "Bang"))
    room.showNames()
//    Empty().showMe() // error: cannot access '<init>': it is private in 'Empty'

    val id = Person3.Id("Felix", "Lee")
    val person3 = Person3(id, 23)
    person3.showMe()

    val wallet = person2.Possession("Wallet")
    wallet.showOwner()

    class Point(val x: Int, val y: Int) {
        fun shift(dx: Int, dy:Int): Point = Point(x + dx, y + dy)
        override fun toString() = "($x, $y)"
    }
    val p = Point(10, 10)
    println(p.shift(-1, 3))
    var x = 1
    class Counter {
        fun increment() {
            x++
        }
    }
    Counter().increment()

    println(x)
}

main()