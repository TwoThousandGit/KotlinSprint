package lesson1

fun main(){
    val second = 6480
    val minute = second/60

    println("$minute:${String.format("%02.0f", second - minute*60F)}")
}