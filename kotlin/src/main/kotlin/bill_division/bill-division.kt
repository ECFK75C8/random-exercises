package bill_division

fun main() {
    val arr = arrayOf(3, 10, 2, 9)
    bonAppetit(arr, 1, 12)
}

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val bActual = bill.filterIndexed { index, _ -> index != k }.sum().div(2)

    val result = if (b == bActual) {
        "Bon Appetit"
    }else {
        "${b - bActual}"
    }

    println(result)
}