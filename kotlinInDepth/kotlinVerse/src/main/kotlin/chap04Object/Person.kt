package chap04Object

class Person {
    var firstName: String = ""
    var familyName: String = ""
    var age: Int = 0

    fun fullName() = "$firstName $familyName"

    fun showMe() {
        println("${fullName()}: ${age}")
    }

    fun setName(firstName: String, familyName: String) {
        this.firstName = firstName
        this.familyName = familyName
    }

    constructor()

    constructor(fullName: String) {
        val names = fullName.split(" ")
        if (names.size != 2) {
            throw IllegalArgumentException("Invalid name: $fullName")
        }
        firstName = names[0]
        familyName = names[1]
    }

    constructor(firstName: String, familyName: String) {
        this.firstName = firstName
        this.familyName = familyName
    }

}