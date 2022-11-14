import com.kotlin.thejoyofkotlin.chap02.generate
import java.time.Instant

data class Person (val name: String, val registered: Instant = Instant.now()) {

    /*
    코틀린에서는 정적 멤버 대신 Component object를 사용
     */
    companion object {
        fun create(xml: String): Person {
            TODO("Write an implementation creating a Person from xml String")
        }
    }
}

fun show(persons: List<Person>) {
    for ((name, date) in persons)
        println("$name's registration date: $date")
}

fun main() {
    val persons = listOf(Person("Felix"), Person("Chris"))
    show(persons)

    Person.create("SomeXmlString")

    val person = generate("Felix")
}

main()