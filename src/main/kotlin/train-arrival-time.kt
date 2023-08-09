const val TIME_CONST = 60
fun main(){

    val trainDepartureTimeHour: Int = 9
    val trainDepartureTimeMinutes: Int = 39
    val trainTravelTimeMinutesAll: Int = 457

    val trainTravelTimeHour: Int = trainTravelTimeMinutesAll / TIME_CONST
    val trainTravelTimeMinutes: Int = trainTravelTimeMinutesAll % TIME_CONST

    val trainDepartureTimeHourAll = trainDepartureTimeHour + trainTravelTimeHour
    val trainDepartureTimeMinutesAll: Int = trainDepartureTimeMinutes + trainTravelTimeMinutes

    val hours: Int = trainDepartureTimeMinutesAll / TIME_CONST + trainDepartureTimeHourAll
    val minutes: Int = trainDepartureTimeMinutesAll % TIME_CONST

    println("Train arrival time: ${String.format("%02d:%02d", hours, minutes)}")

}