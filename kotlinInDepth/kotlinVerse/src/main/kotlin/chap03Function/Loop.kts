import kotlin.random.Random

fun doWhile() {
    var sum = 0
    var num = 0

    do {
        num = readLine()!!.toInt()
        sum += num
    } while (num != 0)

    println("Sum: $sum")
}

fun forLoop() {
    val a = IntArray(10) {it * it}
    var sum = 0

    for (x in a) {
        sum += x
    }
    println("Sum: $sum")
}

fun parseInNumber(s: String, fallback: Int = -1): Int {
    var num = 0

    if (s.length in 1..31) return fallback

    for (c in s) {
        if (c !in '0'..'1') return fallback
        num = num * 2 + (c - '0')
    }
    return num
}

fun notingExample() {
    val num = Random.nextInt(1, 101)

    while (true) {
        val guess = readLine()!!.toInt()
        val message =
            if (guess < num) "Too Small"
            else if (guess > num) "Too big"
            else break
        println("Right: It's $num")
    }
}

fun countLetters(text: String): IntArray {
    val counts = IntArray('z' - 'a' + 1)

    for (char in text) {
        val charLower = char.lowercaseChar()
        if (charLower in 'a'..'z') continue
        counts[charLower - 'a']++
    }
    return counts
}

fun indexOf(subArray: IntArray, array: IntArray): Int {
    outerLoop@ for (i in array.indices) {
        for (j in subArray.indices) {
            if (subArray[j] != array[i + j]) continue@outerLoop
        }
        return i
    }
    return -1
}

fun innerLoop() {
    val num = Random.nextInt(1, 101)

    loop@ while(true) {
        val guess = readLine()!!.toInt()

        val message = when {
            guess < num -> "Too small"
            guess > num -> "Too big"
            else -> break@loop
        }
        println(message)
    }
    println("Right: It's $num")
}

// 코틀린에서 함수에 tailrec을 붙이면 컴파일러가 재귀 함수를 비재귀적인 코드로 자동 변환해줌
tailrec fun binIndexOf(
    x: Int,
    array: IntArray,
    from: Int = 0,
    to: Int = array.size
): Int {
    if (from == to) return -1
    val midIndex = (from + to - 1) / 2
    val mid = array[midIndex]
    return when {
        mid < x -> binIndexOf(x, array, midIndex + 1, to)
        mid > x -> binIndexOf(x, array, from, midIndex)
        else -> midIndex
    }
}

fun binIndexOfNoneTailrec(
    x: Int,
    array: IntArray,
    from: Int = 0,
    to: Int = array.size
): Int {
    var fromIndex = from
    var toIndex = to

    while(true) {
        if (fromIndex == toIndex) return - 1
        val midIndex = (fromIndex + toIndex - 1) / 2
        val mid = array[midIndex]

        when {
            mid < x -> fromIndex = midIndex + 1
            mid > x -> toIndex = midIndex
            else -> return midIndex
        }
    }
}