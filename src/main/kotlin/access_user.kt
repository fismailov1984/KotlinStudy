import java.util.Calendar

fun main() {

    val accessAge = 18
    print("Enter your year of birth: ")
    val dataBirth = readln().toInt()
    val calendar: Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    val age: Int = year - dataBirth

    if (age < accessAge) {
        println("no access to hidden content")
    } else {
        println("show hidden content screen")
    }

}