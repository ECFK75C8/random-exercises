package plus_minus

fun main() {
    plusMinus(arrayOf(-4,3,-9,0,4,1))
}

fun plusMinus(arr: Array<Int>) {
    val negCount = arr.count { it < 0 }
    val zeroCount = arr.count { it == 0 }
    val posCount = arr.count { it > 0}
    val arrLen = arr.size.toDouble()

    arr.distinctBy {  }

    println("%.6f".format(posCount.div(arrLen)))
    println("%.6f".format(negCount.div(arrLen)))
    println("%.6f".format(zeroCount.div(arrLen)))
}