package time_conversion

fun main() {
    val time = timeConversion("11:05:45PM")
    println(time)
}

fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */
    var newS = s
    val hr = s.substring(0, 2).toInt()
    if (s.contains("AM", ignoreCase = true)) {
        if (hr == 12) {
            newS = s.replaceRange(0, 2, "00")
        }
    } else {
        if (hr < 12) {
            newS = s.replaceRange(0, 2, "${12 + hr}")
        }
    }

    return newS.replaceRange(s.length - 2, s.length, "")
}