import kotlin.math.abs

class Day01 : IDay {
    override fun solvePartOne(list: List<String>): Int {
        val (numList1, numList2) = splitList(list)

        return numList1.sorted().zip(numList2.sorted()) { num1, num2 ->
            abs(num1 - num2)
        }.sum()
    }

    override fun solvePartTwo(list: List<String>): Int {
        val (numList1, numList2) = splitList(list)

        val frequencyMap = numList2.groupingBy { it }.eachCount()

        return numList1.map { num1 -> num1 * frequencyMap.getOrDefault(num1, 0) }.sum()
    }

    private fun splitList(list: List<String>): Pair<List<Int>, List<Int>> {
        val numList1: MutableList<Int> = ArrayList()
        val numList2: MutableList<Int> = ArrayList()

        list.map { it.split("\\s+".toRegex()) }.forEach {
            numList1.add(it[0].toInt())
            numList2.add(it[1].toInt())
        }

        return Pair(numList1, numList2)
    }
}