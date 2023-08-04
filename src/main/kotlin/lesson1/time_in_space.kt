package lesson1

fun main(){

    val secondsInSpace: Short = 6480
    val seconds: Int = secondsInSpace % 60
    val hour: Int = secondsInSpace / (60 * 60)
    val minutes: Int = secondsInSpace % (60 * 60) / 60

    val arrayList = arrayListOf(hour.toString(), minutes.toString(), seconds.toString())
    val list = mutableListOf<String>()

    arrayList.forEach {
        if(it.length < 2){
            val t = "0$it"
            list.add(t)
        }else{
            val t = it
            list.add(t)
        }
    }
    println(list.joinToString(":"))

}