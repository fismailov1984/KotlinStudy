import java.awt.List

fun main(){

    var number: Int = 1
    var startPoint: String = "E2"
    var endPoint: String = "E4"
    var table: String = "$startPoint-$endPoint;${number}"
    println(table)

    startPoint = "D2"
    val step = 1
    endPoint = "${startPoint.first()}${(startPoint.last() + step)}"

    table = "$startPoint-$endPoint;${++number}"
    println(table)

}