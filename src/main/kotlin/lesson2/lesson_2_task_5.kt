package lesson2

import kotlin.math.pow

fun main() {
    val deposit = 70_000
    val percent = 0.167
    val years = 20

    val result = deposit * (1 + percent).pow(years)
    println(String.format("%.3f", result * 1F))
}