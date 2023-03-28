package lesson4

const val MAX_CREW = 70
const val MIN_CREW = 55
const val MIN_PROVISION = 50

fun main() {
    val damages: Boolean
    val crewNumber: Int
    val provisionBoxes: Int
    val goodWeather: Boolean
    val isReady: Boolean

    print("Есть ли повреждения корпуса? (true|false): ")
    damages = readLine().toBoolean()
    print("Введте численность экипажа: ")
    crewNumber = readln().toInt()
    print("Введите количество ящиков провизии: ")
    provisionBoxes = readln().toInt()
    print("Благоприятные ли метеоусловия? (true|false): ")
    goodWeather = readLine().toBoolean()

    isReady = (provisionBoxes > MIN_PROVISION) &&
            ((!damages && (crewNumber in (MIN_CREW + 1) until MAX_CREW)) ||
                    ((crewNumber == MAX_CREW) && goodWeather))

    println("Корабль может отправиться в длительное плавание: $isReady")

}