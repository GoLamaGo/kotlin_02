package ru.netology

import kotlin.math.roundToInt

fun main() {

    //Task #1

    println("Task #1\nВведите сумму перевода в копейках")
    val fee = 0.0075
    val amount: Long = readLine()!!.toLong() //в копейках
    val transferFee = if (fee * amount <= 3500) 3500 else (amount * fee).roundToInt()

    println("Комиссия за перевод составит: $transferFee коп")


    //Task #2

    println("\nTask #1\nВведите количество лайков")
    val likes: Int = readLine()!!.toInt()
    val hintText = if (likes % 10 == 1) "Человеку" else "Людям"

    println("Запись понравилась $likes $hintText")


    //Task #3

    println("\nTask #3\nВведите сумму покупки")
    val purchaseAmount = readLine()!!.toInt()

    println("\nВведите сумму предыдущих покупок")
    val previousPurchasesAmount = readLine()!!.toInt()
    val previousPurchasesDiscount: Double = when {
        previousPurchasesAmount <= 1000 -> purchaseAmount.toDouble()
        previousPurchasesAmount > 1000 && previousPurchasesAmount <= 10000 -> 100.0
        else -> purchaseAmount * 0.05
    }

    println("\nЯвляется ли покупатель постоянным клиентом? (true / false)")
    val melomanDiscount = if (readLine()!!.toBoolean() == true) purchaseAmount * 0.01 else purchaseAmount * 0.0

    val finalCost = purchaseAmount - previousPurchasesDiscount - melomanDiscount

    println(finalCost)
}
