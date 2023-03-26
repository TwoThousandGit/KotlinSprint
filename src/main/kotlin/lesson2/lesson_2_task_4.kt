package lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    println("Crystal ore buff: ${(crystalOre * 1.2 - crystalOre).toInt()}")
    println("Iron ore buff: ${(ironOre * 1.2 - ironOre).toInt()}")
}