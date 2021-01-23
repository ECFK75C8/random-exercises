package sales_by_match

fun main() {
    val arr = arrayOf(1,2,1,2,1,3,2)
    val (result, left) = sockMerchant(arr)
    println("$result $left")
}

fun sockMerchant(ar: Array<Int>): Pair<Int, List<Int>> {
    val ctrArr = mutableListOf<Int>()
    var count = 0

    for (i in ar) {
        if (ctrArr.contains(i)){
            ctrArr.remove(i)
            count++
        } else {
            ctrArr.add(i)
        }
    }

    return Pair(count, ctrArr)
}