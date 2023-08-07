fun main(){

    print("ship hull damage: ")
    val shipHullDamage: Boolean = readln().toBoolean()
    print("current crew: ")
    val currentCrew: Int = readln().toInt()
    print("number of boxes on board: ")
    val numberBoxes = readln().toInt()
    print("favorable weather conditions: ")
    val weatherConditions: Boolean = readln().toBoolean()

    val map = mutableMapOf(
        currentCrew to true,
        numberBoxes to true,
        weatherConditions to true,
    )

    if(currentCrew == 70) map[currentCrew] = true else map[currentCrew] = false
    if(numberBoxes > 50) map[numberBoxes] = true else map[numberBoxes] = false
    if(weatherConditions) map[weatherConditions] = true else map[weatherConditions] = false

    if(false in map.values){
        println("ship can't sail")
    } else{
        println("the ship can sail")
    }

}
