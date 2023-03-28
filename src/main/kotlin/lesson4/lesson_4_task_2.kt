package lesson4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 99

fun main() {
    val firstWeight = 20
    val secondWeight = 50
    val secondVolume = 80
    val thirdVolume = 100

    println("Average для груза с весом $firstWeight кг:${firstWeight in MIN_WEIGHT..MAX_WEIGHT}")
    println("Average для груза с весом $secondWeight кг и объемом $secondVolume л:${secondWeight in MIN_WEIGHT..MAX_WEIGHT && secondVolume <= MAX_VOLUME}")
    println("Average для груза с объемом $thirdVolume:${thirdVolume < MAX_VOLUME}")
}