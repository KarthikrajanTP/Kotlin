data class Address(val street: String)
data class Employee(val address: Address?)
data class Company(val employee: Employee?)

fun getStreetName(company: Company?): String {
    return company?.employee?.address?.street ?: "Unknown"
}

fun main() {
    val address = Address("Main Street")
    val employee = Employee(address)
    val company = Company(employee)

    val companyWithNoAddress = Company(Employee(null))
    val companyWithNoEmployee = Company(null)

    println(getStreetName(company))
    println(getStreetName(companyWithNoAddress))
    println(getStreetName(companyWithNoEmployee))
    println(getStreetName(null))
}
