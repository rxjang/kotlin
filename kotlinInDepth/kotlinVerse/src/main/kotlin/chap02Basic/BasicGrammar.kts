/**
 * // 주석 안의 주석
 * JavaDoc과 같은 주석
 */
    /*
    여러 줄 주석
/* 주석 안에 내포된 주석 */ => 자바와 달리 코틀린에서는 여러 줄 주석 내포 가능
 */

// 한 줄 짜리 주석

val timeInSeconds = 15

fun sum() {
    /*
     !!는 null 아님 단언으로 readLine의 결과가 null 인 경우 예외 발생
     a와 b는 지역 변수
     */
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println(a + b)
}

/*
 식별자는 변수나 함수 등 프로그램에 정의된 대상에 붙은 이름
 하드 키워드(val, fun 등)를 식별자로 쓸 수는 없다.
 */
val `fun` = 1
val `name with spaces` = 2

/**
 * val: 불변 변수
 * 한번 초기화 하면 다시는 값을 대입할 수 없음. 자바의 final 과 비슷
 * 부수효과를 일으키지 못하고 함수형 스타일 코드를 장려
 * var: 가변 변수
 */
var sum = 1
sum = sum + 2
sum = sum + 3

/*
자바와 달리 코틀린 대입은 statement이다. 따라서 아무 값도 돌려주지 않는다.
이로 인해 코틀린에서는 a = b = c와 같은 대입문 연쇄를 쓸 수 없다.
 */

var a = 1
println(a++)
println(a--)
