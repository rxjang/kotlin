import java.util.Date

/*
코틀린 에서는 똑같은 타입이 문맥에 따라 원시 타입과 참조 타입을 가리키기 때문에 구분이 모호하다.
모든 코틀린 타입은 근본적으로 어떤 클래스 정의를 기반으로 만들어 진다. 즉, 원시 타입과 비슷한 타입들도 메서드와 프로퍼티를 제공한다.
 */

// 타입은 하위 타입 (subType)으로 계층화 할 수 있다.
val subTypeEg: Any = 1

// _를 넣어서 가독성 높이기
val n = 34_123_456

// 범위 충족시 더 작은 타입 변수에 대입 가능
val one: Byte = 1
//val tooBigForShort: Short = 100_000 // Error : too big for short
val million = 1_000_000 // Int로 타입 추론

// Long
val hundredLong = 100L

// 2진수. 16진수
val bin = 0b10101 // 21
val hex = 0xF9 // 249

// 0 리터럴 금지
// 수 리터럴 경우 0을 표현하는 경우가아니면 맨 앞에 0이 올 수 없다.
val zero = 0

val pi = 3.14
val one = 1.0

val quarter = .25

val pi2 = 0.314E1
val pi100 = 0.314E3
// 부통 소수점 default는 double임
val piF = 3.14f

// Char 타입
// \u 다음에 네자리 16진수를 넣는 시퀀스로 임의의 유니코드 문자를 문자 리터럴에 넣을 수 있다.
val pi = '\u03C0'

val hasErrors = false;
val testPassed = true;

// 두 인지가 모두 같은 타입일때만 == 와 !=를 허용한다.
val a = 1 // Int
val b = 2L // Long
//println(a == b) // Error
//println(a.toLong() == b)
// 하디만 모든 수 타입의 값은 서로 <, <=, >, >= 를 사용해 비교할 수 있다. 이는 수 타입 사이 산순 연산이 가능한 모든 경우를 다룰 수 있도록 오버로딩 된 것과 마찬가지다.

/*
 부동소수점은 NaN값을 특별취급한다.
 기본적으로 NaN은 그 어떤 값과도 같지 않다.
 */
println(Double.NaN == Double.NaN) // false
println(Double.NaN != Double.NaN) // true

val set = sortedSetOf(Double.NaN, Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0)
println(set) // [-Infinity, 0.0, Infinity, NaN]

/*
 위 코드의 결과는 다음과 같은 사실을 보여줌
 NaN은 자기 자신과 같다. 집합에 NaN이 단 하나만 추가 됐기 때문이다.
 NaN은 Double에서 가장 큰 값으로 취급된다. (심지어 양의 무한대보다도 크다.
 */

val text = "Hello, world!\nThis is\"mutiline\" string "
println("\u03C0 \u2248 3.14")

// 기본적으로 ${}의 중괄호 사이에 넣기만 하면, 어떤 올바른 코틀린 식이든 문자열에 넣을 수 있다. 이런 기능을 문자열 템플릭이라고 한다.
fun main() {
    val name = readLine()
    println("Hello, $name!\n Today is ${Date()}")
}

/*
로우 문자열
이스케이프 시퀀스를 사용하지 않고도 문자열을 작성 할 수 있음
 */
val name = readLine()
val message = """Hello $name!""".trimIndent()
// trimIndent()는 여러 줄에 공통된 최소 들여쓰기를 제거해주는 함수이다.
/*
+ 연산자를 사용해 두 문자열을 연결할 수 있다.
문자열은 ==와 !=를 사용해 동등성을 비교할 수 있다.
 */
val s1 = "Hello!"
val s2 = "Hel" + "lo!"
println(s1 == s2)
/*
코틀린에서는 ==가 기본적으로 equals()를 가리키는 편의 문법이다. 즉, ==를 사용하면 직접 equals()를 호출한다.
코틀린에서 참조 동등성을 쓰고 싶으면 ===와 !==fmf tkdydgkaus ehlsek.
 */

/*
배열 구조를 구현하는 가장 일반적인 코틀린 타입은 Array<T>다.
 */
val a =  emptyArray<String>()
val b = arrayOf("hello", "world")
val c = arrayOf(1, 4, 9)

val size = readLine()!!.toInt()
val squares = Array(size) { (it + 1) * (it + 1)}
/*
중괄화 ({})안에 들어있는 언어 요소를 람다라고 부른다.
람다는 인덱스를 기반으로 값을 계산하는 방식을 정의한다.
이때 인덱스를 표현하는 변수로 자동으로 선언되는 it를 사용한다.
 */
val operations = charArrayOf('+', '-', '*', '/', '%')
/*
자바와 달리 코틀린에는 new 연산자가 없기 때문에 배열 인스턴스 생성이 일반 함수 호출처럼 보인다.
코틀린에서는 배열 원소를 명시적으로 초기화해야 한다.
 */

// 원본가 별도로 배열을 만들고 싶다면 copyOf()함수를 사용해야한다. copyOf()는 필요시 다른 크기의 배열을 만들어 내기도 한다.
val numbers = squares.copyOf()
numbers[0] = 1000

/*
자바에서는 상위 타입의 배열에 하위 타입의 배열을 대입할 수 있다.
배열이 가변 데이터 구조이므로 이런 대입은 런타임 시 문제를 발생시킬 수 있다.
이런 이유로 코틀린 배열 타입은 모든 다른 배열 타입과 서로 하위 타입 관계가 성립하지 않는다고 간주되며, 이에 따라 앞에서 본 것 같은 대입도 금지된다.
 */
val strings = arrayOf("one", "two")
//val objects: Array<Any> = strings // 예외

/*
배열을 생성하고 나면 그 길이를 바꿀 수 없지만 + 연산을 사용해 원소를 추가해 새로운 배열을 만들 수는 있다.
 */

val b = intArrayOf(1, 2, 3) + 4
val c = intArrayOf(1, 2, 3) + intArrayOf(5, 6)

// 문자열과 달리 배열에 대한 ==와 != 연산자는 원소 자체를 비교하지 않고 참조를 비교한다.
intArrayOf(1, 2, 3) == intArrayOf(1, 2, 3) // false
// 배열 내용을 비교하고 싶으면 contentEquals()함수를 사용
intArrayOf(1, 2, 3).contentEquals(intArrayOf(1, 2, 3)) // true



