package diagonal_difference

import kotlin.math.abs

fun main() {
    val arr = arrayOf(
        arrayOf(3,2,3),
        arrayOf(4,5,6),
        arrayOf(9,8,9)
    )

    println(diagonalDifference(arr))
}


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var priSum = 0
    var priIndex = 0
    var secSum = 0
    var secIndex = arr.size - 1

    for (column in arr){
        priSum += column[priIndex++]
        secSum += column[secIndex--]
    }

    return abs(priSum - secSum)
}