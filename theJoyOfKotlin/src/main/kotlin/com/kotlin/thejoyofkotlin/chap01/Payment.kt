package com.kotlin.thejoyofkotlin.chap01

data class Payment(val creditCard: CreditCard, val amount: Int) {

    fun combine(payment: Payment): Payment =
        if (creditCard == payment.creditCard)
            Payment(creditCard, amount + payment.amount)
        else
            throw IllegalStateException("Cards don't match.")

    companion object {
        fun groupByCard(payments: List<Payment>): List<Payment> =
            // List<Payment>를 Map<CreditCard, List<Payment>로 변환
            payments.groupBy { it.creditCard }
                // Map<CreditCard, List<Payment>를 List<List<Payment>>로 변환
                .values
                // 각 List<Payment>를 단일 Payment로 축약. 이를 통해 List<Payment>에 들어있는 모든 지급을 하나의 Payment로 축약
                .map { it.reduce(Payment::combine) }
    }
}