package sub_array_division_chocolate_bar

fun main() {
    println(birthday(arrayOf(4), 4, 1))
}

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var count =  0
    for (i in 0..(s.size - m)) {
        var curr = i
        val sum = Array(m) { s[curr++] }
            .fold(0) { prev, element -> prev + element }
        if (sum == d) count++
    }
    return count
}