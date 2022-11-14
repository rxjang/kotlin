fun add(a: Int, b: Int) = a + b

fun sumOfPrimes(limit: Int): Long {
    val seq: Sequence<Long> = sequenceOf(2L) + generateSequence(3L) {
        it + 2
    }.takeWhile {
        it < limit
    }

    fun isPrime(n: Long): Boolean = seq.takeWhile {
        it * it <= n
    }.all {
        n % it != 0L
    }
    return seq.filter(::isPrime).sum()
}

// 확장 함수는 마치 클래스에 정의된 인스턴스 함수인 것처럼 객체를 호출할 수 있는 함수를 말한다.
fun <T> List<T>.length() = this.size
val ints = listOf(1, 2, 3, 4, 5, 6, 7)
val listLength = ints.length()
fun List<Int>.product(): Int = this.fold(1) {a, b -> a * b}
val product = ints.product()
println(product)

// 람다 사용하기
fun triple(list: List<Int>): List<Int> = list.map { it * 3 }

val multiplier = 3

fun multiplyAll(list: List<Int>, multiplier: Int) : List<Int> = list.map { it * multiplier }