fun main() {

    val trainingDay: Int = 5
    val exercise = "exercises of the"

    val mapMutableList = mutableMapOf(
        "arms" to 1,
        "legs" to 2,
        "back" to 2,
        "press" to 1,
    )

    for (i in mapMutableList) {
        println("$exercise ${i.key}: ${(trainingDay % 2 == 1) && (i.value == 1) || (trainingDay % 2 == 0) && (i.value == 2)}")
    }
}