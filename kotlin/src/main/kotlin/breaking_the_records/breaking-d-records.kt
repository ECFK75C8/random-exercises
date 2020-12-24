package breaking_the_records

fun main() {
    println(breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)).toList())
}

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var minScore = scores[0]
    var maxScore = scores[0]

    var minCount = 0
    var maxCount = 0

//    for (score in scores) {
//        when {
//            score < minScore -> {
//                minCount++
//                minScore = score
//            }
//            score > maxScore -> {
//                maxCount++
//                maxScore = score
//            }
//        }
//    }

    for (i in 1 until scores.size){
        if (scores[i] < minScore){
            minCount++
            minScore = scores[i]
        }else if (scores[i] > maxScore) {
            maxCount++
            maxScore = scores[i]
        }else continue
    }

    return arrayOf(maxCount, minCount)
}