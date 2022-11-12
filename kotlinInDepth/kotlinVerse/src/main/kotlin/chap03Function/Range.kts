val chars = 'a'..'h'
val twoDigits = 10..99
val zero2One = 0.0..1.0
val numUntil = 10 until 20 // 20은 제외임
val twoDigitsReverse = 99 downTo 10
val steps = 1..10 step 3
val helloWorld = "Hello, World"
IntArray(10) {it * it}.sliceArray(2..5)

val num = 2
println(num in twoDigits)
println(num !in twoDigits)
println("def" in "abc".."xyz")
println(helloWorld.substring(1..4))
println(helloWorld.substring(1 until 4))
println(helloWorld.substring(1, 4))

fun main() {

    val numbers = intArrayOf(3, 7, 2, 1)
    val text = "Hello!"
    println(2 in numbers)
    println(4 in numbers)
    println('a' in text)
    println("He" in text)

}

main()