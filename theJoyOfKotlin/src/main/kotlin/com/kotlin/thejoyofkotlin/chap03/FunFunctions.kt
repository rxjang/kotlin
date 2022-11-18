package com.kotlin.thejoyofkotlin.chap03

class FunFunctions {

    var percent1 = 5
    private var percent2 = 9
    val percent3 = 13

    fun add(a: Int, b: Int): Int = a + b

    fun mul(a: Int, b: Int?):Int = 5

    fun div(a: Int, b: Int): Int = a / b

    fun div(a: Double, b: Double): Double = a / b

    fun applyTax1(a: Int): Int = a / 100 * (100 + percent1)

    fun applyTax2(a: Int): Int = a / 100 * (100 + percent2)

    fun applyTax3(a: Int): Int = a / 100 * (100 + percent3)

    fun append(i: Int, list: MutableList<Int>): List<Int> {
        list.add(i)
        return list
    }

    fun append2(i: Int, list: List<Int>) = list + i

    fun applyTax1(ff: FunFunctions, a: Int): Int = a / 100 * (100 + ff.percent1)

    fun double(x: Int): Int = x * 2

    val double: (Int) -> Int = { x -> x * 2}

    // 맨 마지막에 return을 붙이면 안됨
    val doubleThenIncrement: (Int) -> Int = { x ->
        val double = x * 2
        double + 1
    }

    val add: (Int, Int) -> Int = { x, y -> x + y}

    /*
    파라미터가 튜플이 아니라면 (파라미터가 원소가 1개뿐인 튜플일 경우), it라는 이름을 사용해 그 파라미터를 가리킬 수 있음
     */
    val double2: (Int) -> Int = { it * 2 }

    val multipleBy2: (Int) -> Int = {n -> double(n)}

    val multipleBy2_2: (Int) -> Int = {double(it)}

    val multipleBy2_3: (Int) -> Int = ::double

    fun square(n : Int) = n * n

    fun triple(n: Int) = n * 3

}