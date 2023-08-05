import kotlin.math.pow

fun main(){

//    Сумму вклада можно вводить с клавиатуры таким образом:
//    val depositAmount: Double = readln().toDouble()

    val depositAmount: Double = 70_000.0
    val annualInterestRate: Double = 16.7
    val depositTerm = 20

    val totalDepositAmount: Double = ((depositAmount * (1 + annualInterestRate/100).pow(depositTerm)))
    println("total deposit amount: ${ String.format("%.3f", totalDepositAmount) }")

}