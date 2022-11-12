import kotlin.math.PI

/*
타입 지정을 생략해도ㄷ 되는 벼눗와 달리 파라미터에는 항상 타입을 지정해야한다. 컴파일러는 함수 정의에서 파라미터 타입을 추론하지 못한다.

반환 타입은 함수 파라미터에서 추론이 가능한데도 명시해야 한다.
함수에서 결괏값을 결정해 외부로 나가는 지점이 여러 곳일 수 있는데 함수 본문의 모든 반환 지점을 살펴보고 반환 타입을 알아내기 어려울 수 있기 때문이다.

하지만 경우에 따라 반환 타입을 생략할 수 있는데, 두 가지 예외사항이 있다.
1. Unit 타입을 반환 하는경우
자바 void에 해당하는 코틀린 타입으로, 함수가 의미 있는 반환값을 돌려주지 않는다는 뜻이다.
아래 두 함수의 정의는 서로 동등하다.
 */
fun prompt(name: String) {
    println("********* Hello, $name! ***********")
}

fun prompt2(name: String): Unit {
    println("********* Hello, $name! ***********")
}
/*
2. 식이 본문인 함수 (expression-body)
어떤 함수가 단일 식으로만 구현될 수 있을 때
 */
fun circleArea(radius: Double): Double = PI * radius * radius
fun circleArea2(radius: Double) = PI * radius * radius

/*
블록이 본문인 함수를 정의할 때 {} 앞에 = 를 넣으면 이 블록이 익명한수를 기술하는 람다로 해석된다.
이 정의에서 return을 추가하면 컴파일 오류가 발생한다. 타입 불일치가 발생하기 때문이다.
식이 본문인 함수 안에서 return 문은 금지된다.
 */
fun circleArea3(radius: Double) = {PI * radius * radius}
