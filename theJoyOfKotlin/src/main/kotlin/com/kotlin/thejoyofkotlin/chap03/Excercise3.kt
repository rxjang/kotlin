package com.kotlin.thejoyofkotlin.chap03

val add: (Int) -> (Int) -> Int = {a -> {b -> a + b}}

typealias IntBinOp = (Int) -> (Int) -> Int

val add2: IntBinOp = {a -> {b -> a + b}}
val mult: IntBinOp = {a -> {b -> a * b}}
