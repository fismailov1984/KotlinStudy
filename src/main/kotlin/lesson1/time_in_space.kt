package lesson1

const val TIME_CONST: Int = 60
fun main(){

    val secondsInSpace: Short = 6480
    val seconds: Int = secondsInSpace % TIME_CONST
    val hour: Int = secondsInSpace / (TIME_CONST * TIME_CONST)
    val minutes: Int = secondsInSpace % (TIME_CONST * TIME_CONST) / TIME_CONST

    printTime(hour, minutes, seconds)
}
fun printTime(h: Int, m: Int, s: Int){
    println(String.format("%02d:%02d:%02d", h, m, s))
}