package came_case

fun main() {
    println(camelcase(""))
}

fun camelcase(s: String): Int {

    return s.split("").map {
        if (it.trim() != "" && it.single().isUpperCase()) 1
        else 0
    }.fold(1, {prev, element -> prev + element} )

}
