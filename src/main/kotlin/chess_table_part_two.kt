fun main() {

    val moveChess = "D2-D4;0"
    val startPoint: String
    val endPoint: String
    val number: String

    val list = moveChess.split("[-;]".toRegex())

    startPoint = list[0]
    endPoint = list[1]
    number = list[2]

    println("Start point: $startPoint")
    println("End point: $endPoint")
    println("move number: $number")

}