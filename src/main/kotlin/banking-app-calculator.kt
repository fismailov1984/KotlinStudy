import kotlin.math.pow

fun main(){

    val depositAmount: Double = 70_000.0
    val annualInterestRate: Double = 16.7
    val depositTerm = 20

    val totalDepositAmount: Double = ((depositAmount * (1 + annualInterestRate/100).pow(depositTerm)))
    println("total deposit amount: ${ String.format("%.3f", totalDepositAmount) }")

}