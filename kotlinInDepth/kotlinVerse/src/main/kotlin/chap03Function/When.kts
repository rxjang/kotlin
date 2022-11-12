fun hexDigit (n: Int): Char {
    when {
        n in 0..9 -> return '0' + n
        n in 10..15 -> return 'A' + n - 10
        else -> return '?'
    }
}

fun numberDescription(n: Int): String = when (n) {
    0 -> "Zero"
    1, 2, 3 -> "Small"
    in 10..100 -> "Large"
    !in Int.MIN_VALUE until 0 -> "Negative"
    else -> "Huge"
}

fun main() {
    println(hexDigit(12))
}

main()