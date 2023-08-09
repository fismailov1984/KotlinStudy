const val VOLUME_MAX = 100
const val WEIGHT_MAX = 100
fun main() {

    val cargoVolume = arrayOf(80, 100)
    val cargoWeight = arrayOf(20, 50)

    checkCargo(cargoVolume[0], cargoWeight[0])
    checkCargo(cargoVolume[1], cargoWeight[1])

}

fun checkCargo(volume: Int, weight: Int) {

    println(
        "A load of $weight and a volume of $volume liters corresponds to the category 'Average'" +
                ":${volume < VOLUME_MAX && weight <= WEIGHT_MAX}"
    )

}