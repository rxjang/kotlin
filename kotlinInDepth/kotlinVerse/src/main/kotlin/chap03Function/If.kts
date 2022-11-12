fun max(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

fun max2(a: Int, b:Int) = if (a > b) a else b

fun test(args: Array<String>) {
    if (args.isNotEmpty()) {
        val message = "Hello, ${args[0]}"
        println(message)
    } else {
        println()
    }
}

fun renamePackage(fullName: String, newName: String): String {
    val i = fullName.lastIndexOf('.')
    val prefix = if (i >= 0) fullName.substring(0, i + 1) else return newName
    return prefix + newName
}

fun main() {
    println(renamePackage("lee.felix", "yb"))
}

main()
