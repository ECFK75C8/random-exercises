package sum_of_odd_numbers

fun main() {
    println(rowSumOddNumbers(1))
}

fun rowSumOddNumbers(n: Int): Int {
    if (n < 2) return n

    var firstTerm = 1
    var commonRatio = 2

    for (i in 2..n) {
        firstTerm += commonRatio
        commonRatio += 2
    }

    return firstTerm + Array(n - 1) {
        firstTerm += 2
        firstTerm
    }.sum()
}