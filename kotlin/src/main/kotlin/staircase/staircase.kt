package staircase

fun main() {
    staircase(6)
}

// Complete the staircase function below.
fun staircase(n: Int): Unit {
    var space = n-1
    Array(n) { println(" ".repeat(space--) + "#".repeat(it+1)) }
}

