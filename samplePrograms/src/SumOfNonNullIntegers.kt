fun sumOfNonNullIntegers(numbers: List<Int?>): Int {
    return numbers.filterNotNull().sum()
}

fun main() {
    val list = listOf(1, 2, null, 4, null, 6)
    println(sumOfNonNullIntegers(list))
}
