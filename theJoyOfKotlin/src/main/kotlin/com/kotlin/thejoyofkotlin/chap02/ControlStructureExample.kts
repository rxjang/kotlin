val a: Int = readLine()!!.toInt()
val b: Int = readLine()!!.toInt()

val s = if (a < b)
    "a is smaller than b"
else
    "a is not smaller than b"

print(s)

// 첫 번째 분기는 두 줄로 이루어졌기 때문에 블록으로 감싸야 함
val percent = if (b != 0) {
    val temp = a / b
    temp * 100
} else {
    0
}

// 코틀린의 다중 조건 when은 break가 필요 없음
val country = readLine()!!
val capital = when (country) {
    "Australia" -> "Canberra"
    "Bolivia" -> "Sucre"
    "Brazil" -> "Brasilia"
    else -> "Unknown"
}

val tired: Boolean = false
val capital2 = when {
    tired -> "check for yourself"
    country == "Australia" -> "Canberra"
    country == "Bolivia" -> "Sucre"
    country == "Brazil" -> "Brasilia"
    else -> "Unknown"
}

for (i in 0 until 10 step 2) {
    println(i)
}
