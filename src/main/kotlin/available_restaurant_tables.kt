const val ALL_TABLES: Int = 13
fun main() {

    val occupiedTablesToday: Int = ALL_TABLES
    val availableTablesTomorrow: Int = 4
    val occupiedTablesTomorrow: Int = ALL_TABLES - availableTablesTomorrow
    val textToday: String = "Table availability for today"
    val textTomorrow: String = "Table availability for tomorrow"

    comparison(occupiedTablesToday, textToday)
    comparison(occupiedTablesTomorrow, textTomorrow)

}

fun comparison(tables: Int, text: String) {
    if (ALL_TABLES - tables == 0) {
        println("$text: ${false}")
    } else {
        println("$text: ${true}")
    }
}