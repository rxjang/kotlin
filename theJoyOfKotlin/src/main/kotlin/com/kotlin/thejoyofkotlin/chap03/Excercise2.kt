package com.kotlin.thejoyofkotlin.chap03

fun<T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }