package com.kotlin.thejoyofkotlin.chap03

val f: (Double) -> Double = { Math.PI / 2 - it}
val sin: (Double) -> Double = Math::sin
val cos: Double = compose(f, sin)(2.0)

val cosValue: Double = compose({ x:Double -> Math.PI / 2 - x}, Math::sin)(2.0)