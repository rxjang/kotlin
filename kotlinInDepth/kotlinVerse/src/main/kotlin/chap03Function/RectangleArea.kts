import kotlin.math.sqrt

/*
함수 인자는 순서대로 파라미터에 전달된다.
 */
fun rectangleArea(width: Double, height: Double): Double {
    return width * height
}

/*
코틀린은 이름 붙은 인자라고 불리는 방식도 제공한다.
 */
val w = 3.0
val h = 4.0
rectangleArea(width = w, height = h)
rectangleArea(height = w, width = h)

/*
한 호출 안에서 위치 기반 인자와 이름 붙츤 인자를 함께 사용할 수 있다.
 */
fun swap(s: String, from: Int, to: Int): String {
    val chars = s.toCharArray()
    val tmp = chars[from]
    chars[from] = chars[to]
    chars[to] = tmp
    return chars.concatToString()
}

fun main() {
    println(swap("Hello", 1, 2))
    println(swap("Hello", from = 1, to = 2))
    println(swap("Hello", to = 3, from = 0))
    println(swap(from = 1, s = "Hello", to = 2))
    println(swap(s = "Hello", 1, to = 2))
//    println(swap(s = "Hello", 1, from = 2)) // error
}

main()