package pascal_triangle

fun main() {
    println(fibProd(800).toList())
}

fun fibProd(prod: Long): LongArray {
    val fnArray = arrayOf<Long>(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181)

    for (i in fnArray.indices) {
        if (i < fnArray.size - 1){
            val fn = fnArray[i]
            val fn1 = fnArray[i + 1]

            if (fn * fn1 == prod){
                return longArrayOf(fn, fn1, 1)
            } else if (fn * fn1 > prod) {
                return longArrayOf(fn, fn1, 0)
            }
        }

    }

    return longArrayOf()
}


