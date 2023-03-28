package lesson4

const val MAX_TABLE_SIZE = 13

fun main() {
    val tablesTomorrow = 9
    val tablesToday = 13

    println("Доступность столиков на сегодня: ${tablesToday < MAX_TABLE_SIZE}")
    println("Доступность столиков на завтра: ${tablesTomorrow < MAX_TABLE_SIZE}")
}