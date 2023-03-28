package lesson4

fun main() {
    val trainingDay = 5

    println(
        """
        |Упражнения для рук: ${trainingDay % 2 == 1}
        |Упражнения для ног: ${trainingDay % 2 != 1}
        |Упражнения для спины: ${trainingDay % 2 != 1}
        |Упражнения для преса: ${trainingDay % 2 == 1}
       """.trimMargin()
    )
}