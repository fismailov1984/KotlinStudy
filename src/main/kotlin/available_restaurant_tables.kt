const val ALL_TABLES: Int = 13
fun main() {

    val occupiedTablesToday: Int = 13
    val availableTablesTomorrow: Int = 4
    val occupiedTablesTomorrow: Int = ALL_TABLES - availableTablesTomorrow
    val textToday: String = "Table availability for today"
    val textTomorrow: String = "Table availability for tomorrow"

    checkAvailabilityTable(occupiedTablesToday, textToday)
    checkAvailabilityTable(occupiedTablesTomorrow, textTomorrow)

}

fun checkAvailabilityTable(tables: Int, text: String) {
    if (tables == ALL_TABLES) {
        println("$text: ${false}")
    } else {
        println("$text: ${true}")
    }
}