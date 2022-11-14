
fun main() {
    val name: String by lazy(::getName)
    println("안녕1")
    val name2: String by lazy {name}
    println("안녕2")
    println(name)
    println(name2)
    println(name)
    println(name2)
}

fun getName(): String {
    println("이름 계산 중...")
    return "Felix Lee"
}

main()