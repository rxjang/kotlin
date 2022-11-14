val x: Int = 3
val y: Int? = x

val s: String? = readLine()
val l = s?.length

// 엘비스 연산자 `?:`로 기본 값을 지정할 수 있음
// val city: City = map[company]?.manager?.address?.city ?: City.UNKNOWN