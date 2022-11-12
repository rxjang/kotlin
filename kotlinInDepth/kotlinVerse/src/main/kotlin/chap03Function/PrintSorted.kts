/*
함수도 파라미터 정의 앞에 vararg 변경자를 붙여 인자의 개수가 정해지지 않는 파라미터를 사용할 수 있다.
 */
fun printSorted(vararg items: Int) {
    items.sort()
    println(items.contentToString())
}

// 스프레드 연산자인 *를 사용하면 배열을 가변인자 대신 넙길 수 있다.
fun printSorted() {
    val numbers = intArrayOf(6, 2, 10, 1)
    printSorted(*numbers)
//    printSorted(numbers)  // error
    printSorted(6, 2, 10, 1)
}

/*
스프레드는 배열을 복사한다.
따라서 파라미터의 배열의 내용을 바꿔도 원본 원소에는 영향을 미치지 않는다.
하지만 이때 얕은 복사가 이뤄진다.
배열 내부에 참조가 들어가 있는 경우에는 참조가 복사되기 때문에 참조가 가리키는 데이터가 호출하는 쪽과 함수 내부 배열에서 공유된다.
 */
fun printSorted2() {
    val a = intArrayOf(6, 2, 10, 1)
    printSorted(*a)
    println(a.contentToString())
}

fun change(vararg items: IntArray) {
    items[0][0] = 100
}

fun printChanges() {
    val a = intArrayOf(1, 2, 3)
    val b = intArrayOf(4, 5, 6)
    change(a, b)
    println(a.contentToString())
    println(b.contentToString())
}

/*
둘 이상을 vararg 파라미터로 선언하는 것은 금지됨
하지만 varag 파라미터에 콤마로 분리한 여러 인자와 스프레드를 섞어서 전달하는 것은 괜찮음
 */
printSorted(6, 1, *intArrayOf(3, 8), 2)

printSorted(items = *intArrayOf(1, 2, 3))
//printSorted(items = 1, 2, 3) // Error

// 디폴트 값이 파라미터 앞에 있는 경우
fun printSorted(prefix: String = "", vararg items:Int) {}
// 디폴트 값이 파라미터 뒤에 있는 경우
fun printSorted(vararg items:Int, prefix: String = "") {}
// vararg는 보어로딩 해소에도 영향을 미친다.

fun main() {
    printChanges()
}

main()