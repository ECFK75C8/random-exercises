package persistent_bugger

import came_case.split

fun main() {
    println(persistence(999))
}

fun persistence(num: Int): Int {
    var count = 0
    var cp = num
    while (cp > 9) {
        cp = cp.toString().split()
            .fold(1) { acc, s -> acc * s.toInt() }
        count++
    }
    return count
}

