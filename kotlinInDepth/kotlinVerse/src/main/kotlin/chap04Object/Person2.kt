package chap04Object

class Person2(val firstName: String,
              private val familyName: String) {
    val fullName = "$firstName $familyName"

    inner class Possession(val description: String) {
        fun showOwner() = println(fullName())
        fun getOwner() = this@Person2
    }

    private fun fullName() = "$firstName $familyName"

    fun printFirstName() {
        println(firstName)
    }

    // 초기화 블록에는 return 문이 들어가지 못한다.
    init {
        println("Created new Person2 instance: $fullName")
    }
}