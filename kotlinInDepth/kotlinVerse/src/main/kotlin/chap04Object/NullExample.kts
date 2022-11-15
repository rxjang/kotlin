fun isLetterString(s: String?): Boolean {
    if (s == null) return false
    if (s.isEmpty()) return false
    for (ch in s) {
        if (!ch.isLetter()) return false
    }
    return true
}

fun isBooleanString(s: String?) = s == "false" || s == "true"

fun exclaim(s: String?) {
    println("$s!")
}

fun describeNumber(n: Int?) = when (n) {
    null -> "null"
    in 0..10 -> "small"
    in 11..100 -> "large"
    else -> "out of range"
}

fun isSingleChar(s: String?) = s != null && s.length == 1

// null 아님 단언 연산자
//val n = readLine()!!.toInt()
fun test()  {
    var name: String? = null

    fun initialize() {
        name = "john"
    }

    fun sayHello() {
        println(name!!.uppercase())
    }

    initialize()
    sayHello()
}

fun readInt() = readLine()?.toInt()

fun readIntTest() {
    val n = readInt() // Int?

    if (n != null) {
        println(n + 1)
    } else {
        println("No value")
    }
}

fun sayHello(name: String?) {
    println("Hello, " + (name ?: "Unknown"))
}

fun readIntElvis() = readLine()?.toInt() ?: 0

class Name(val firstName: String, val familyName: String?)

class Person(val name: Name?) {
    fun describe(): String {
        val currentName = name ?: return "Unknown"
        return "${currentName.firstName} ${currentName.familyName}"
    }
}

fun main() {
    println(Person(Name("Felix", "Lee")).describe())
    println(Person(null).describe())
}

main()
