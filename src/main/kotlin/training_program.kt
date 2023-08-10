fun main() {

    val trainingDay: Int = 5
    val exercise = "exercises of the"
    val isEvent = when (trainingDay % 2) {
        0 -> false
        else -> true
    }

    val mapMutableList = mutableMapOf(
        "arms" to 1,
        "legs" to 2,
        "back" to 2,
        "press" to 1,
    )

    for (i in mapMutableList) {

        println("$exercise ${i.key}: ${(isEvent) && (i.value == 1) || (!isEvent) && (i.value == 2)}")
    }
}