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
    when (count) {
        2 -> println("Congratulations! You have won the grand prize!")
        1 -> println("You have won a consolation prize!")
        else -> println(
            "You didn't win anything, try again...\n" +
                    "Numbers needed to win: $FIRST_NUMBER and $SECOND_NUMBER"
        )
    }

}

fun enterNumber(text: String): Int {

    var number: Int = 0

    var count = 0
    while (count < 1) {
        print("Enter $text number in the range 1..100: ")
        number = readln().toInt()
        if (number > 100 || number == 0) count = 0 else count++
    }
    return number
}