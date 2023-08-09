
import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    val userName: String = "Farhod"
    val formatter = SimpleDateFormat("k")
    val time = formatter.format(Date())

    val greeting: String

    if(time.toInt() in 0..16) {
        greeting = "Good day"
    }else{
        greeting = "Good evening"
    }
    println("$greeting $userName")

}