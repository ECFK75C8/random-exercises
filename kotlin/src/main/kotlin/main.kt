import triplet.Triple

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    return 0
}

//fun main(args: Array<String>) {
//    val candles = arrayOf<Int>(1,2,3,3,4)
//
//    val result = birthdayCakeCandles(candles)
//
//    println(result)
//}

fun main(args: Array<String>) {
    val result = Triple().compareTriplets(arrayOf(5, 6, 7), arrayOf(3, 6, 10))

    println(result.joinToString(" "))
}