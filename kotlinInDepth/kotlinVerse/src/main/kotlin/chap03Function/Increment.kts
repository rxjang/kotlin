/*
Java 메서드 파라미터는 디폴트가 가변이므로 함수 내부에서 변경하지 못하게 하려면 final 을 지정해 불변 값으로 바꿔야 하는데,
코틀린 함수 파라미터는 무조건 불변이다.
그리고 파리미터 앞에 val이나 var을 표시할 수 없다는 점에 유의하라
 */
fun incrementOne(n: Int): Int {
//    return n++ //Error: cannot change immutable variable
    return n + 1
}

/*
코틀린은 call-by-value를 사용한다. 즉, 파라미터 값에 호출하는 쪽의 인자를 복사한다는 뜻이다.
파라미터가 참조라면 호툴한 쪽의 데이터는 그대로 남아있고 이 데이터에 대한 참조만 복사된다.
따라서 파라미터 자체는 함수 내부에서 바뀔 수 없디만, 파라미터가 가리키는 데이터는 바뀔 수 있다.
 */
fun increment(a: IntArray): Int {
    return ++a[0]
}

fun main() {
    val a = intArrayOf(1, 2, 3)
    println(increment(a)) //2
    println(a.contentToString()) // [2, 2, 3]
}

main()

