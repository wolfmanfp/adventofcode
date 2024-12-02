import kotlin.math.abs

class Day02 : IDay {
    override fun solvePartOne(list: List<String>): Int {
        return list.map { it.split("\\s+".toRegex()) }
            .map { toDiffList(it) }
            .map { arr: IntArray ->
                if (arr.all { abs(it) in 1..3 } && (isArrayIncreasing(arr) || isArrayDecreasing(arr))) {
                    "safe"
                } else "unsafe"
            }
            .count { it == "safe" }
    }

    override fun solvePartTwo(list: List<String>): Int {
        return 0
    }

    private fun toDiffList(arr: List<String>): IntArray {
        val diffList: MutableList<Int> = ArrayList()
        for (i in 1..arr.lastIndex) {
            diffList.add(arr[i].toInt() - arr[i - 1].toInt())
        }
        return diffList.toIntArray()
    }

    private fun isArrayIncreasing(arr: IntArray): Boolean {
        for (num in arr) {
            if (num <= 0) {
                return false
            }
        }
        return true
    }

    private fun isArrayDecreasing(arr: IntArray): Boolean {
        for (num in arr) {
            if (num >= 0) {
                return false
            }
        }
        return true
    }

}