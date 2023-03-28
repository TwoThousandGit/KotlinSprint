package lesson4

fun main() {
    val goodWeatherToday = true
    val isTendOpen = true
    val moisture = 20
    val isWinter = true

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            goodWeatherToday && isTendOpen && moisture == 20 && isWinter
        }"
    )
}