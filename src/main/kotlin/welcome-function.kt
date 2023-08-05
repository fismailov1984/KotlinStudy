
import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    val userName: String = "Farhod"
    val formatter = SimpleDateFormat("k")
    val time = formatter.format(Date())

    print("${greetings(time)} $userName")
}
fun greetings(time: String): String {
    return if (time.toInt() in 0..<16) "Good day"
    else "Good evening"
}