// 기본적으로 코틀린 컬렉션은 불변이다.
var list = listOf(1, 2, 3)
val list1 = listOf(1, 2, 3)
val list2 = list1 + 4
val list3 = list1 + list2
println(list1)
println(list2)
println(list3)

// 가변 컬렉션이 필요하면 이를 명시해아 한다.
val list4: List<Int> = mutableListOf(1, 2, 3)
//val list5: List<Int> = list4.add(4)
//val list6: List<Int> = list4.addAll(list4)
println(list4)
