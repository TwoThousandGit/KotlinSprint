package lesson5

const val ACCESS_AGE = 18
const val CURRENT_YEAR = 2023

fun main() {
    print("Введите год рождения: ")
    val userBirth = readLine()!!.toInt()
    val userAge = CURRENT_YEAR - userBirth

    val resultText = if (userAge >= ACCESS_AGE) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченым контентом"
    else "Вернуться на главный экран"

    println(resultText)
}