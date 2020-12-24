package apple_and_orange

fun main() {
    countApplesAndOranges(7, 11, 5, 15, arrayOf(-2,2,1), arrayOf(5,-6))
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
    val appleCount = apples.map { a + it }.filter { it in s..t }.count()
    val orangeCount = oranges.map { b + it }.filter { it in s..t }.count()

    println("$appleCount\n$orangeCount")
}