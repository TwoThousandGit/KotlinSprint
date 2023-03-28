package lesson4

fun main() {
    val isSunnyToday = true
    val isTendOpen = true
    val moisture = 20
    val isWinter = true

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            isSunnyToday && isTendOpen && moisture == 20 && isWinter
        }"
    )
}