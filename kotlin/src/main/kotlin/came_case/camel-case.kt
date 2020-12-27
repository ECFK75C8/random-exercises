package came_case

fun main() {
    println(camelcase(""))
}

fun camelcase(s: String): Int = s.split().map {
    if (it.single().isUpperCase()) 1
    else 0
}.fold(1, { prev, element -> prev + element })

fun String.split(): Array<String> = Array(this.length) { this[it].toString() }
