package lesson1

fun main(){

    val numberOrders: Int = 75
    val thanksPurchase: String = "Thank you for your purchase!"

    println("The number of orders $numberOrders")
    println(thanksPurchase)

    var amountOfWorkers: Int = 2000

//    println("number of online store employees $amountOfWorkers")

    var numberDismissedWorkers: Int = 1
    amountOfWorkers -= numberDismissedWorkers

    println("total number of dismissed workers $amountOfWorkers")

}