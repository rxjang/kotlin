package com.kotlin.thejoyofkotlin.chap03

fun <T, U, V> higherAndThen(): ((T) -> U) -> ((U) -> V) -> (T) -> V = {f -> {g -> {x -> g(f(x))}}}