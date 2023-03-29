package lesson4

const val MAX_CREW = 70
const val MIN_CREW = 55
const val MIN_PROVISION = 50

fun main() {
    print("Есть ли повреждения корпуса? (true|false): ")
    val damages = readLine().toBoolean()
    print("Введте численность экипажа: ")
    val crewNumber = readln().toInt()
    print("Введите количество ящиков провизии: ")
    val provisionBoxes = readln().toInt()
    print("Благоприятные ли метеоусловия? (true|false): ")
    val goodWeather = readLine().toBoolean()

    val isReady = (provisionBoxes > MIN_PROVISION) &&
            ((!damages && (crewNumber in (MIN_CREW + 1) until MAX_CREW)) ||
                    ((crewNumber == MAX_CREW) && goodWeather))

    println("Корабль может отправиться в длительное плавание: $isReady")
}