const val FIRST_NUMBER = 37
const val SECOND_NUMBER = 82
fun main() {

    val firstNumber: Int = enterNumber("first")
    val secondNumber: Int = enterNumber("second")

    var count: Int = 0
    if (firstNumber == FIRST_NUMBER || secondNumber == FIRST_NUMBER) {
        count += 1
    }
    if (firstNumber == SECOND_NUMBER || secondNumber == SECOND_NUMBER) {
        count += 1
    }
    when {
        count == 2 -> println("Congratulations! You have won the grand prize!")
        count == 1 -> println("You have won a consolation prize!")
        else -> println("You didn't win anything, try again...")
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