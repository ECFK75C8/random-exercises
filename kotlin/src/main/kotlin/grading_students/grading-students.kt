package grading_students

fun main() {
    println(gradingStudents(arrayOf(73,67,38,33)).toList())
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    return grades.map {
        val nextMul = it / 5 * 5 + 5
        when {
            it < 38 -> it
            nextMul - it < 3 -> nextMul
            else -> it
        }
    }.toTypedArray()
}