class WhiteBoarding {
    companion object {
        //[1,2,2,2,1] arr
        fun solution(arr: List<Int>): List<Int>? {
            val countArray = Array(100) { 0 }
            for (i in arr.indices) {
                val ele = arr[i]
                countArray[ele] += 1
            }
            return countArray.toList()
        }
    }
}

fun main() {
    val arr = listOf<Int>(2,3,3,4,1)
    val result = WhiteBoarding.solution(arr)
    println(result)
}