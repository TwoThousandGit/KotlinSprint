package lesson5

fun main() {
    val firstSecretNum = 99
    val secondSecretNum = 11

    println("\"Лотерейка\" - угадайте 2 числа от 0 до 100 и выиграйте главный приз - 1000$ ")
    print("Попробуйте угадать первое число: ")
    val firstUserNum = readln().toInt()
    print("Хорошо!\nТеперь попробуйте угадать второе число: ")
    val secondUserNum = readln().toInt()

    val resultText = if (((firstUserNum == firstSecretNum) || (firstUserNum == secondSecretNum))
        && ((secondUserNum == secondSecretNum) || (secondUserNum == firstSecretNum))
    )
        "Поздравляем! Вы выиграли главный приз!"
    else if (((firstUserNum == firstSecretNum) || (firstUserNum == secondSecretNum))
        || ((secondUserNum == secondSecretNum) || (secondUserNum == firstSecretNum))
    )
        "Вы выиграли утешительный приз!"
    else {
        "Неудача! Крутите барабан!\nЧисла были $firstSecretNum и $secondSecretNum"
    }

    println(resultText)
}