fun main(){

    val sunnyWeather: Boolean = true
    val openTent: Boolean = true
    val airHumidity: Int = 20
    val season: String = "winter"

    conditionCheck(sunnyWeather, openTent, airHumidity, season)
}
fun conditionCheck(weather: Boolean, tent: Boolean, humidity: Int, season: String){

    println("Are the conditions right now for the growth of legumes? " +
            "${weather && tent && humidity == 20 && season != "winter"}")

}
