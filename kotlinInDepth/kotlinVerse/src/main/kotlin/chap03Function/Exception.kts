fun parseIntNumber(s: String): Int {
    var num = 0

    if (s.length !in 1..31) throw NumberFormatException("Not a number: $s")

    for (c in s) {
        if (c !in '0'..'1') throw NumberFormatException("Not a number: $s")
        num = num * 2 + (c - '0')
    }
    return num
}

fun sayHello(name: String) {
    val message =
        if (name.isNotEmpty()) "Hello, $name"
        else throw java.lang.IllegalArgumentException("Empty name")

    println(message)
}

fun readInt(default: Int): Int {
    return try {
        readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        default
    }
}

fun readInt(default: Int) = try {
    readLine()!!.toInt()
} finally {
    println("Error")
}