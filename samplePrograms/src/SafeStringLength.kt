fun safeStringLength(input: String?): Int {
    return input?.length ?: -1 // Safe call + Elvis operator
}

fun main() {
    println(safeStringLength("Kotlin"))
    println(safeStringLength(null))
}
