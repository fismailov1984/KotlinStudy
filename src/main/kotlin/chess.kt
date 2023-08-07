import java.awt.List

fun main(){

    var moveNumber: Int = 1
    val countCell = 1
    var startPoint: String = "E2"
    var endPoint: String = "E4"
    var table: String = "$startPoint-$endPoint;${moveNumber}"
    println(table)

    startPoint = "D2"
    endPoint = "${startPoint.first()}${(startPoint.last() + countCell)}"

    table = "$startPoint-$endPoint;${++moveNumber}"
    println(table)

}