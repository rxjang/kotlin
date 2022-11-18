package com.kotlin.thejoyofkotlin.chap03

fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = {x -> f(g(x))}

fun simpleCompose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = {f(g(it))}
