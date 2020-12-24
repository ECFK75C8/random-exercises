package number_line_jump

fun main() {
    println(kangaroo(0, 3, 3, 2))
}

// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = if (v1 > v2) {
    if ((x1 - x2) % (v2 - v1) == 0) "YES"
    else "NO"
} else "NO"
