fun main() {

    val adminLogin = "Zaphod"
    val adminPassword = "PanGalactic"
    val mapUsers = mutableMapOf<String, String>()

    print("Please input username: ")
    val userName = readln()
    print("Please input password: ")
    val userPassword = readln()

    if ((userName == adminLogin) && (userPassword == adminPassword)) {
        println("access to the spacecraft board is open")
    }
    if (userName != adminLogin) {
        mapUsers[userName] = userPassword
        println("new user registration completed")
    }

}