fun main() {
    println("Enter the number of rows:")
    val numberOfRows = readln().toInt()
    println("Enter the number of seats in each row:")
    val numberOfSeats = readln().toInt()
    var menuIndicator = 99
    var numberPurchasedTickets = 0
    var percentage = 0.0
    var currentIncome = 0

    val cinemaSeats = MutableList(numberOfRows + 1) { MutableList(numberOfSeats + 1) { "S" } }
    generateSeatsTable(cinemaSeats, numberOfRows, numberOfSeats)

    while (menuIndicator != 0) {
        println(
            "\n1. Show the seats" +
                    "\n2. Buy a ticket" +
                    "\n3. Statistics" +
                    "\n0. Exit"
        )
        menuIndicator = readln().toInt()
        when (menuIndicator) {
            1 -> printList(cinemaSeats)
            2 -> {
                var rowNumber = 0
                var repeat: Boolean = true
                while (repeat) {
                    rowNumber = buyTicket(cinemaSeats)
                    if (rowNumber != 0) {
                        repeat = false
                    }
                }
                println("\nTicket price: $${coast(numberOfRows, numberOfSeats, rowNumber)}")
                numberPurchasedTickets += 1
                percentage = (numberPurchasedTickets * 1.0) / (numberOfRows * numberOfSeats) * 100
                currentIncome += coast(numberOfRows, numberOfSeats, rowNumber)
            }

            3 -> {
                println(
                    "\nNumber of purchased tickets: $numberPurchasedTickets" +
                            "\nPercentage: ${"%.2f".format(percentage)}%" +
                            "\nCurrent income: $$currentIncome" +
                            "\nTotal income: $${totalIncome(numberOfRows, numberOfSeats)}"
                )
            }

            0 -> return
        }
    }
}

fun totalIncome(numberOfRows: Int, numberOfSeats: Int): Int {
    if (numberOfRows * numberOfSeats < 60) {
        return numberOfRows * numberOfSeats * 10
    } else return numberOfSeats * (numberOfRows / 2 * 10 + (numberOfSeats - numberOfRows / 2) * 8)
}

fun buyTicket(cinemaSeats: MutableList<MutableList<String>>): Int {
    println("\nEnter a row number:")
    val rowNumber = readln().toInt()
    println("Enter a seat number in that row:")
    val seatNumber = readln().toInt()
    if (seatNumber in 1..cinemaSeats.size-1 && rowNumber in 1..cinemaSeats[0].size-1) {
        if (cinemaSeats[rowNumber][seatNumber] == "B") {
            println("\nThat ticket has already been purchased!")
            return 0
        } else cinemaSeats[rowNumber][seatNumber] = "B"
    } else {
        println("\nWrong input!")
        return 0
    }
    return rowNumber
}

fun coast(numberOfRows: Int, numberOfSeats: Int, userRow: Int): Int {
    val allSeats = numberOfRows * numberOfSeats
    val bigPrice = 10
    val smallPrice = 8

    if (allSeats <= 60) return bigPrice
    else {
        if (userRow <= (numberOfRows / 2)) return bigPrice
        else return smallPrice
    }
}

fun generateSeatsTable(cinemaSeats: MutableList<MutableList<String>>, numberOfRows: Int, numberOfSeats: Int) {
    cinemaSeats[0][0] = " "
    for (i in 1..numberOfRows) {
        cinemaSeats[i][0] = (i).toString()
    }
    for (i in 1..numberOfSeats) {
        cinemaSeats[0][i] = (i).toString()
    }
}

fun printList(list: MutableList<MutableList<String>>) {
    println("\nCinema:")
    for (row in list) {
        println(row.joinToString(" "))
    }
}