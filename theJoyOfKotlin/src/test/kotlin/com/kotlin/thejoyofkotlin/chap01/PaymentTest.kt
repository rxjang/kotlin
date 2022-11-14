package com.kotlin.thejoyofkotlin.chap01

import io.kotlintest.properties.Gen
import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec
import java.util.Random

class PaymentTest: StringSpec() {
    init {
        "buyDonut" {
            forAll(Gen.list(PurchaseGenerator())) { purchases: List<Purchase> ->
                val paymentList = purchases.map { it.payment}
                val groupedPaymentList = Payment.groupByCard(paymentList)
                val paymentMap: Map<CreditCard, Int> = groupedPaymentList.fold(mapOf()) { map, (creditCard, amount) -> map + (Pair(creditCard, amount)) }
                val creditCardSet: Set<CreditCard> = purchases.fold(setOf()) { set, purchase -> set + purchase.payment.creditCard }
                val charges: List<Pair<CreditCard, List<Payment>>> = creditCardSet.map { creditCard -> Pair(creditCard, paymentList.filter { it.creditCard == creditCard}) }
                charges.fold(true) { acc, p -> acc && p.second.sumBy { it.amount } == paymentMap[p.first]}
            }
        }
    }
}

class PurchaseGenerator: Gen<Purchase> {
    override fun constants(): Iterable<Purchase> = listOf()

    override fun random(): Sequence<Purchase> {
        val creditCard1 = CreditCard()
        val creditCard2 = CreditCard()
        val random = Random()
        return Gen.choose(0, 100).map {
            if (random.nextBoolean()) buyDonuts(it, creditCard1) else buyDonuts(it, creditCard2) }.random()
    }
}