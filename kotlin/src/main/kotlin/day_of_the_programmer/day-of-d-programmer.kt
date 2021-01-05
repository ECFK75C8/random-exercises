package day_of_the_programmer

fun main() {
    println(dayOfProgrammer(1918))
}

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    val feb = if (year == 1918) 15 else if (year.isLeap()) 29 else 28
    val mMap = mapOf(
        "Jan" to 31,
        "Feb" to feb,
        "Mar" to 31,
        "Apr" to 30,
        "May" to 31,
        "Jun" to 30,
        "Jul" to 31,
        "Aug" to 31
    )

    val day = 256 - mMap.values.reduce { acc, i -> acc + i }
    return "$day.09.$year"
}

fun Int.isLeap(): Boolean = (this < 1919 && this % 4 == 0) ||
    (this % 4 == 0 && this % 100 != 0) || (this % 400 == 0)
