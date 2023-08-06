fun main(){

    val number: Int = 7
    val list = mutableListOf<String>()

    for(element in 1..9){
        val result: String = "$number * $element = ${number * element}\n"
        list.add(result.toString())
    }
    println(list.joinToString(""))

}