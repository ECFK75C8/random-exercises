package roman_numerals

import came_case.split

fun main() {
    println(romanToDecimal("X"))
}

fun romanToDecimal(roman: String): Int {
    val specialDec = arrayOf(1,10,100)

    val numMap = mapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )
    val decList = roman.split().map { numMap[it] }

    var index = 0
    var total = 0

    while (index < decList.size) {
        val curr = decList[index]
        val next = if (1 + index < decList.size ) decList[index + 1] else 0
        if (specialDec.contains(curr) && curr!! < next!!) {
            total += next - curr
            index += 2
        }else {
            total += curr!!
            index += 1
        }
    }

    return total
}