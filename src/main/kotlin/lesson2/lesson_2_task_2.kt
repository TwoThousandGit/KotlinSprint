package lesson2

fun main() {
    val workers = 50
    val salaryWorker = 30_000
    val intern = 20
    val salaryIntern = 20_000
    val workerCost: Int
    val totalCost: Int
    val averageSalary: Int

    workerCost = workers * salaryWorker
    totalCost = workerCost + intern * salaryIntern
    averageSalary = totalCost / (workers + intern)

    println(workerCost)
    println(totalCost)
    println(averageSalary)
}