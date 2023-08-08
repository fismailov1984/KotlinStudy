const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val IS_AIR_HUMIDITY = 20
const val IS_SEASON = "winter"
fun main() {

    checkCondition(IS_SUNNY, IS_AWNING_OPEN, IS_AIR_HUMIDITY, IS_SEASON)
}

fun checkCondition(weather: Boolean, tent: Boolean, humidity: Int, season: String) {

    println(
        "Are the conditions right now for the growth of legumes? " +
                "${weather && tent && humidity == 20 && season != "winter"}"
    )

}
