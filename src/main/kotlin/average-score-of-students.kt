fun main(){

    val totalStudents: Int = 4
    val studentBalls: List<Int> = listOf(3, 4, 3, 5)

    var totalBalls: Int = 0
    for(item in studentBalls){
        totalBalls += item
    }
    val totalAverageBall: Float = totalBalls.toFloat() / totalStudents
    print("Average score of students: $totalAverageBall")

}