package lesson4

fun main() {
    val weatherToday = "солнечно"
    val awningCondition = "тент раскрыт"
    val moisture = 20
    val season = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            weatherToday == "солнечно" && awningCondition == "тент раскрыт" && moisture == 20 && season == "зима"
        }"
    )
}