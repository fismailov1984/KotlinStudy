fun main(){

    val numberOfPermanentEmployees: Int = 50
    val numberOfTrainees: Int = 30
    val permanentEmployeesSalary: Int = 30_000
    val traineesSalary: Int = 20_000

    val permanentEmployeesSalaryCosts: Int = numberOfPermanentEmployees * permanentEmployeesSalary
    val traineesEmployeesSalaryCosts: Int = numberOfTrainees * traineesSalary

    val totalSalaryCosts: Int = permanentEmployeesSalaryCosts + traineesEmployeesSalaryCosts
    val finalAverageSalary = totalSalaryCosts / (numberOfPermanentEmployees + numberOfTrainees)

    println("Salaries of permanent employees: $permanentEmployeesSalaryCosts")
    println("total payroll costs for all employees: $totalSalaryCosts")
    println("Average employee salary: $finalAverageSalary")

}