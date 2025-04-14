fun checkAgreement(response: Boolean?): String {
    return when (response) {
        true -> "Agreed"
        false -> "Disagreed"
        null -> "No response"
    }
}

fun main() {
    println(checkAgreement(true))
    println(checkAgreement(false))
    println(checkAgreement(null))
}
