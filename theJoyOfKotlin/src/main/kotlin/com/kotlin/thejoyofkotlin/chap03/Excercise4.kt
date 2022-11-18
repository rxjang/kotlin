package com.kotlin.thejoyofkotlin.chap03

val compose: ((Int) -> Int) -> ((Int) -> Int) -> (Int) -> Int = {x -> {y -> {z -> x(y(z))}}}

typealias IntUnaryOp = (Int) -> Int

val compose2: (IntUnaryOp) -> (IntUnaryOp) -> IntUnaryOp = {x -> {y -> {z -> x(y(z))}}}

val square: IntUnaryOp = {it * it}

val triple: IntUnaryOp = {it * 3}

val squareOfTriple = compose(square)(triple)