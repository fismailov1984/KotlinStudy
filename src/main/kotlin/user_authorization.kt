fun main() {


    val firstNumber = (1..100).random()
    val secondNumber = (1..100).random()
    println("plus two numbers to ensure that you are not a robot: $firstNumber and $secondNumber: ")

    val sum = readln().toInt()

    if (sum == (firstNumber + secondNumber)) println("welcome")
    else println("no access")

}