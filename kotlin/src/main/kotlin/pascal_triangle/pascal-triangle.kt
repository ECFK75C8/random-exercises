package pascal_triangle

fun main() {
    val triangle = PascalTriangle.rows(5)

    for (row in triangle) {
        for (i in row) {
            print("$i ")
        }
        println()
    }
}

class PascalTriangle {

    companion object {
        private lateinit var prevRow: Array<Int>

        private fun generateInnerRow(row: Int): Array<Int> {
            prevRow = Array(row + 1) {
                when (it) {
                    0, row -> 1
                    else -> prevRow[it - 1] + prevRow[it]
                }
            }
            return prevRow
        }

        fun rows(numberOfRows: Int) = Array(numberOfRows) { generateInnerRow(it) }
    }
}