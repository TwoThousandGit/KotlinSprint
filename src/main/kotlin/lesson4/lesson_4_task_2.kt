package lesson4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 99

    println("Average для груза с весом 20 кг:${20 <= maxWeight && 20>=minWeight}")
    println("Average для груза с весом 50 кг и объемом 80 л:${50 <= maxWeight && 50>=minWeight && 80 <= maxVolume}")
    println("Average для груза с объемом 100л:${100 < maxVolume}")
}