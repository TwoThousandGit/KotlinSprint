package lesson2


fun main() {
    val startHour = 9
    val startMinute = 39
    val wayTime = 457


    val endMinute = startMinute + wayTime % 60 - ((startMinute + wayTime % 60) / 60) * 60
    val endHour = startHour + wayTime / 60 + (startMinute + wayTime % 60) / 60

    println("${String.format("%02.0f", endHour * 1F)}:${String.format("%02.0f", endMinute * 1F)}")
}