package divisible_sum_pairs

import kotlin.math.floor

fun main() {
//    println(divisibleSumPairs(3, arrayOf(1,3,2,6,1,2)))
//    println(divisibleSumPairs(5, arrayOf(1,2,3,4,5,6)))

    var a = Math.round(2.5)

    println(a)
}

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(k: Int, ar: Array<Int>): Int {
    // O(n^2)
    var count = 0
    for (i in ar) {
        for (j in ar) {
            if (i < j && (i + j) % k == 0) {
                count ++
            }
        }
    }
    return count
}
