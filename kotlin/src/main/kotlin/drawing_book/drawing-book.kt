package drawing_book

import java.lang.Integer.min

fun main() {
    println(pageCount(6, 2))
}

/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {
    val tt = n / 2
    val f2b = p / 2
    val b2f = tt - f2b
    return  arrayOf(f2b, b2f).min()!!
}