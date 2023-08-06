fun main(){

    val lastName: String = "Андреева"
    val maidenName: String = "Татьяна"
    val surname: String = "Сергеевна"
    val firstName: String = "Сидорова"
    var age: Int = 20

    getPersonalData(lastName, maidenName, surname, firstName, age)

    age = 22
    getPersonalData(lastName, maidenName, surname, firstName, age)
}

fun getPersonalData(lastName: String, maidenName: String, surname: String, firstName: String, age: Int){
    if(age >= 22){
        println("$firstName $maidenName $surname, $age")
    }else{
        println("$lastName $maidenName $surname, $age")
    }
}