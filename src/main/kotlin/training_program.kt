fun main() {

    val trainingDay: Int = 5
    val exercise = "exercises of the"
    val isEvent = trainingDay % 2 == 0

    val mapMutableList = mutableMapOf(
        "arms" to !isEvent,
        "legs" to isEvent,
        "back" to isEvent,
        "press" to !isEvent
    )

    for (i in mapMutableList) {

        println("$exercise ${i.key}: ${i.value}")
    }
}