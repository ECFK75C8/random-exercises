package between_two_sets

fun main() {
    val a = arrayOf(2,6)
    val b = arrayOf(24, 36)
    println(getTotalX(a, b))
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    var count = 0

    for (i in 1..100) {
        if (a.all { i % it == 0 }){
            if (b.all { it % i == 0 }){
                count++
            }
        }
    }
    return count
}