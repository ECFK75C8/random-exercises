package algorithm

fun main() {
    println(gradingStudents(arrayOf(73,67,38,33)).toList())
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val len = grades.size
    val new = Array(len) {0}
    for (i in grades.indices){
        val grade = grades[i]
        if (grade < 38){
            new[i] = grade
        }else {
            val div = grade / 5
            val next = div * 5 + 5
            if ((next - grade) < 3){
                new[i] = next
            }else{
                new[i] = grade
            }
        }
    }

    return new
}
