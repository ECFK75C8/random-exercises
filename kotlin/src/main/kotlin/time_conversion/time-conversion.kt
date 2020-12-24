package time_conversion

fun main() {
    val time = timeConversion("12:05:45AM")
    println(time)
}

fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */
    var newS = s

    if (s.contains("AM", ignoreCase = true)){
        if (s.substring(0..1) == "12"){
            newS = s.replaceRange(0..1, "00")
        }
    } else {
        val sub = s.substring(0..1).toInt()
        if ( sub < 12){
            newS = s.replaceRange(0..1, "${12 + sub}")
        }
    }

    return newS.replaceRange(startIndex = s.length - 2, endIndex = s.length, replacement = "")
}