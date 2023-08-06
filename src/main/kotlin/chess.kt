import java.awt.List

fun main(){

    val number = 1
    var startPoint: String = "E2"
    var endPoint: String = "E4"
    var table: String = "$startPoint, $endPoint; ${number}"
    println(table)

    startPoint = "D2"
    val step = 1
    endPoint = "${startPoint.first()}${(startPoint.last() + number)}"

    table = "$startPoint, $endPoint; ${number+step}"
    println(table)









}