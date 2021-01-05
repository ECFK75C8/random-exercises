package migratory_birds

fun main() {
    println(migratoryBirds(arrayOf(1, 4, 4, 4, 5, 3)))
}

// Complete the migratory_birds.migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    val birdsMap = mutableMapOf<Int, Int>()
    for (i in arr) {
        if (birdsMap.containsKey(i)) {
            val result = birdsMap[i] ?: 0
            birdsMap[i] = result + 1
        }else {
            birdsMap[i] = 1
        }
    }

//    val map = arr.fold(mutableMapOf<Int, Int>()) {prev, el -> prev.putIfAbsent(el, 1)}

    val max = birdsMap.values.max()

    return birdsMap.filter { it.value == max }.keys.min()!!
}