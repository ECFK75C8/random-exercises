package array_conversion

import kotlin.math.ln

fun main() {
    println(arrayConversion(arrayOf(1,2,3,4,5,6,7,8,9,10)))
}

fun arrayConversion(arr: Array<Int>): Int {
    var newArray = arr
    var itter = 0

    while (newArray.size > 1) {
        val a = mutableListOf<Int>()
        if (itter % 2 == 0) {
            for (i in newArray.indices step 2) {
                val value = newArray[i] + newArray[i+1]
                a.add(value)
            }
        }else {
            for (i in newArray.indices step 2) {
                val value = newArray[i] * newArray[i+1]
                a.add(value)
            }
        }
        newArray = a.toTypedArray()
        itter += 1
    }

    return newArray[0]
}
