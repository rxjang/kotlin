package com.kotlin.thejoyofkotlin.chap01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DonutShopTest {

    @Test
    fun testBuyDonuts() {
        val creditCard = CreditCard()
        val purchase = buyDonuts(5, creditCard)
        assertEquals(Donut.price * 5, purchase.payment.amount)
        assertEquals(creditCard, purchase.payment.creditCard)
    }
}