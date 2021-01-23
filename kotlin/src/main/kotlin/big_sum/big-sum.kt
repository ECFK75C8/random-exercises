package big_sum

fun main() {
    val s = arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    println(aVeryBigSum(s))
}

// Complete the aVeryBigSum function below.
fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.fold(0L) {prev, el -> prev + el }
}