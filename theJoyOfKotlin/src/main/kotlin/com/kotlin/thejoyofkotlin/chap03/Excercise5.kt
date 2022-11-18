package com.kotlin.thejoyofkotlin.chap03

fun <T, U, V> compose(): ((U) -> V) -> ((T) -> U) -> (T) -> V = {f -> { g -> {x -> f(g(x))}}}

val squareOfTriple2 = compose<Int, Int, Int>()(square)(triple)