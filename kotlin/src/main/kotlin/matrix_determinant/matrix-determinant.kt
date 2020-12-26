package matrix_determinant

fun main() {
    val ar = arrayOf(arrayOf(2,5,3), arrayOf(1,-2,-1), arrayOf(1,3,4))
    val ans = matrixDet(ar)
    println(ans)
}

fun matrixDet(arr: Array<Array<Int>>): Int {
    return when (arr.size) {
        0 -> 0
        1 -> arr.first()[0]
        2 -> arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0]
        else -> {
            var result = 0
            for (i in arr.indices) {
                val ans = matrixDet(minor(i, arr))
                if (i % 2 == 0){
                    result += arr.first()[i] * ans
                }else {
                    result -= arr.first()[i] * ans
                }
            }
            result
        }
    }
}

fun minor(index: Int, arr: Array<Array<Int>>): Array<Array<Int>> {
    val ar = mutableListOf<Array<Int>>()

    for (i in 1 until arr.size) {
        val inner = mutableListOf<Int>()
        for (j in arr.indices) {
            if (j == index) continue
            inner.add(arr[i][j])
        }
        ar.add(inner.toTypedArray())
    }
    return ar.toTypedArray()
}