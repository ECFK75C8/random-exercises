package min_max_sum

fun main() {
    miniMaxSum(arrayOf(1,2,3,4,5))
}

fun miniMaxSum(arr: Array<Int>): Unit {
    val sumArray = Array<Long>(arr.size) {0}

    for (i in arr.indices){
        var sum: Long = 0;
        for (j in arr.indices){
            if (i == j){
                continue
            }
            sum += arr[j].toLong()
        }
        sumArray[i] = sum
    }

    sumArray.sort()
    println("${sumArray.first()} ${sumArray.last()}")
}