package whiteboarding

fun main() {
    val array = listOf(2,4,5,6,7,8)
    println(binarySearch(array, 8))
}

fun binarySearch(arr: List<Int>, value: Int): Int {
    var startIndex = 0
    var stopIndex = arr.size

    while (startIndex < stopIndex) {
        val midIndex = (startIndex + stopIndex).div(2)
        val valueAtMid = arr[midIndex]
        when {
            value < valueAtMid -> stopIndex = midIndex
            value > valueAtMid -> startIndex = midIndex + 1
            else -> return midIndex
        }
    }
    return -1
}

//fun binary(arr: List<Int>, value: Int): Int {
//
//}