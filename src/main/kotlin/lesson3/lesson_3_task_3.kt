package lesson3

fun main() {
    val number = 6

    val table = """
        |$number * 1 = $number
        |$number * 2 = ${number * 2}
        |$number * 3 = ${number * 3}
        |$number * 4 = ${number * 4}
        |$number * 5 = ${number * 5}
        |$number * 6 = ${number * 6}
        |$number * 7 = ${number * 7}
        |$number * 8 = ${number * 8}
        |$number * 9 = ${number * 9}
        |$number * 10 = ${number * 10}
       """.trimMargin()

    println(table)
}