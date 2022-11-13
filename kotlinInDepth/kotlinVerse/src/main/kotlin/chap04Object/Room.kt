package chap04Object

/*
 함수와 마찬가지로 디폴트 값과 vararg를 생성해 파라미터에 사용할 수 있다.
 */
class Room(vararg val persons: Person2) {
    fun showNames() {
        for (person in persons) println(person.firstName)
    }

}