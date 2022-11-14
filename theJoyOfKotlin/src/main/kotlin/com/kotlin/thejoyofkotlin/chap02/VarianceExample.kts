/*
변성(Variance)는 파라미터화한 타입이 서로 어떤 하위 타입 관계에 있는지 결정하는 방식을 뜻한다.'
공변성(covariance)은 Red가 Color의 하위타입일 때 Matcher<Red>가 Matcher<Color>의 하위 타입이라는 뜻이다.
코틀린에서는 in과 out이라는 키워드로 변성을 지정한다.
 */

val s = "A String"
val a: Any = s

val ls = listOf("A String")
val la = ls + 42 // 코틀린은 la의 타입을 List<Any>로 추론함

fun <T> addAll(list1: MutableList<T>,
                list2: MutableList<T>) {
    for (elem in list2) list1.add(elem)
}

val lss = mutableListOf("A String")
val laa: MutableList<Any> = mutableListOf()
//addAll(laa, lss) // 컴파일 되지 않음

fun <T> addAll2(list1: MutableList<T>,
               list2: MutableList<out T>) { // T를 고엽넛ㅇ으로 만듦
    for (elem in list2) list1.add(elem)
}
addAll2(laa, lss)

open class MyClassParent

class MyClass: MyClassParent()

interface Bag<out T> {
    fun get(): T
}

class BagImpl: Bag<MyClass> {
    override fun get(): MyClass = MyClass()
}

val bag: Bag<MyClassParent> = BagImpl()

/*
in이나 out을 하나도 지정하지 않으면 파라미터 타입은 무공변성이다.
타입을 오직 출력 (반환 값)에 쓰면 out
오직 입력 (인자 값)에 쓰면 in을 사용한다고 기억하면 간단하다.
 */