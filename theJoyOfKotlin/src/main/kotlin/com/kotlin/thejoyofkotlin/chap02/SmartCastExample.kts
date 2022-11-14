val payload: Any = readLine()!!

val length: Int = if (payload is String)
    payload.length
else
    -1

val result: Int = when (payload) {
    is String -> payload.length
    is Int -> payload
    else -> -1
}

// as 연산자를 사용하면 일반적인 안전하지 않은 방식으로 타입 변환을 할 수 있다.
val result: String = payload as String
// 객체가 타입 변환이 가능한 올바른 타입이 아니라면 ClassCastException이 발생한다. 코틀린에서는 이런 타입 변환에 사용할 수 있는 as?연산자를 제공한다.
val result2: String? = payload as? String
// 타입 변환에 실패하면 예외가 발생하는 대신 null이 결과로 설정된다.