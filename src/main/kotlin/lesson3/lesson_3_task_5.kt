package lesson3

fun main() {
    val userReq = "D2-D4;0"

    val list = userReq.split("-", ";")

    val startPosition = list[0]
    val endPosition = list[1]
    val moveNumber = list[2]

    println(startPosition)
    println(endPosition)
    println(moveNumber)
}