package com.kotlin.thejoyofkotlin.chap01

class CreditCard {

    var total: Int = 0
        private set

    fun charge(price: Int) {
        this.total += price
    }
}