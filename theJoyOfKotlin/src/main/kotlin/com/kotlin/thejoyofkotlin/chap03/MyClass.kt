package com.kotlin.thejoyofkotlin.chap03

class MyClass {
    fun double(n: Int): Int = n * 2
}

val foo = MyClass()
val multipleBy2: (Int) -> Int = foo::double

/*
{ obj: MyClass, n: Int -> (obj::double)(n)} 과 같음
즉, multipleBy2와 multipleBy2_2는 다름
 */
val multipleBy2_2: (MyClass, Int) -> Int = MyClass::double

class MyClass2 {
    companion object {
        fun double(n: Int): Int = n * 2
    }
}

// .Companion이나 괄호 잊지 않기
val multipleBy2_3: (Int) -> Int = (MyClass2)::double
val multipleBy2_4: (Int) -> Int = MyClass2.Companion::double

