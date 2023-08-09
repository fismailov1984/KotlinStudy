fun main(){

    val baff: Int = 20
    val percent: Float = 100.0f
    val crystalOre = 7
    val ironOre = 11

    var crystalOreAdd = 0
    val crystalOreBaff: Float = (crystalOre / percent) * baff
    crystalOreAdd += crystalOreBaff.toInt()

    var ironOreAdd = 0
    val ironOreBaff: Float = (ironOre / percent) * baff
    ironOreAdd += ironOreBaff.toInt()

    println("amount of bonus crystal ore: $crystalOreAdd")
    println("amount of bonus iron ore: $ironOreAdd")

}