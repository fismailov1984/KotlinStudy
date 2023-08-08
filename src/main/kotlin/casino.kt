fun main() {

    val firstWinningNumber = (1..100).random()
    val secondWinningNumber = (1..100).random()

    val firstNumber: Int = enterNumber("first")
    val secondNumber: Int = enterNumber("second")

    var count: Int = 0
    if (firstNumber == firstWinningNumber || secondNumber == firstWinningNumber) {
        count += 1
    }
    if (firstNumber == secondWinningNumber || secondNumber == secondWinningNumber) {
        count += 1
    }
    when {
        count == 2 -> println("Congratulations! You have won the grand prize!")
        count == 1 -> println("You have won a consolation prize!")
        else -> println(
            "You didn't win anything, try again...\n" +
                    "Numbers needed to win: $firstWinningNumber and $secondWinningNumber"
        )
    }

}

fun enterNumber(text: String): Int {

    var Number: Int = 0

    var count = 0
    while (count < 1) {
        print("Enter $text number in the range 1..100: ")
        Number = readln().toInt()
        if (Number > 100 || Number == 0) count = 0 else count++
    }
    return Number
}