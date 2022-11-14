package com.kotlin.thejoyofkotlin.chap02

import java.time.Instant

// open은 확장에 대해 열려있다는 뜻
open class Person (val name: String, val registered: Instant = Instant.now()) : java.io.Serializable, Comparable<Person> {
    override fun compareTo(other: Person): Int {
        TODO("Not yet implemented")
    }
}