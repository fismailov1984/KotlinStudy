fun main() {

    val cargoVolume = arrayOf(80, 100)
    val cargoWeight = arrayOf(20, 50)

    cargoCheck(cargoVolume[0], cargoWeight[0])
    cargoCheck(cargoVolume[1], cargoWeight[1])

}

fun cargoCheck(volume: Int, weight: Int) {

    val volumeMax: Int = 100
    val weightMax: Int = 100

    println(
        "A load of $weight and a volume of $volume liters corresponds to the category 'Average'" +
                ":${volume < volumeMax && weight <= weightMax}"
    )

}