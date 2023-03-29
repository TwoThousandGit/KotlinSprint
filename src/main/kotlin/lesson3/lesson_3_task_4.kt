package lesson3

fun main() {
    var startPosition = "E2"
    var endPosition = "E4"
    var moveNumber = 1

    println("[$startPosition-$endPosition;$moveNumber]")

    startPosition = "D2"
    endPosition = "D3"
    moveNumber++

    println("[$startPosition-$endPosition;$moveNumber]")
}