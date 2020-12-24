package triplet

class Triple {
    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
        var aScore = 0
        var bScore = 0

        for (i in a.indices){
            if (a[i] > b[i]){
                aScore++
            }else if (a[i] < b[i]){
                bScore++
            }
        }

        return arrayOf(aScore, bScore)
    }

    fun main(args: Array<String>) {

        val result = compareTriplets(arrayOf(5, 6, 7), arrayOf(3, 6, 10))

        println(result.joinToString(" "))
    }
}