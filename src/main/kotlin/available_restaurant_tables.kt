fun main() {

    val allTables: Int = 13
    val availableTablesToday = 13
    val availableTablesTomorrow = 4
    val textToday: String = "Table availability for today"
    val textTomorrow: String = "Table availability for tomorrow"

    comparison(allTables, availableTablesToday, textToday)
    comparison(allTables, availableTablesTomorrow, textTomorrow)

}
fun comparison(allTables: Int, availableTables: Int, text: String){
    if(availableTables == allTables){
        println("$text: ${false}")
    } else{
        println("$text: ${true}")
    }
}