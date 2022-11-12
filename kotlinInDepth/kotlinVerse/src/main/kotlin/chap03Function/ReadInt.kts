/*
코틀린 함수도 오버로딩 할 수 있다.
 */
fun readInt() = readLine()!!.toInt()
fun readInt(radix: Int) = readLine()!!.toInt(radix)
fun readInt2(radix: Int = 10) = readLine()!!.toInt(radix)

fun mul(a: Int, b: Int) = a * b
fun mul(a: Int, b: Int, c:Int) = a * b * c
fun mul(s: String, n: Int) = s.repeat(n)
fun mul(o: Any, n: Int) = Array(n) {o}
mul("o", 3)
mul("o" as Any, 3)

fun restrictToRange(
    from: Int = Int.MIN_VALUE,
    to: Int = Int.MAX_VALUE,
    what: Int
) : Int = Math.max(from, Math.min(to, what))

fun mul2(a: Int, b: Int = 1) = a * b
fun mul2(a: Int, b: Long = 1L) = a * b
fun mul2(a: Int, b: Int, c:Int = 1) = a * b * c

fun main() {
//    println(mul2(10)) // 1과 2중 어느 쪽을 호출할지 결정 할 수 없음
}

main()