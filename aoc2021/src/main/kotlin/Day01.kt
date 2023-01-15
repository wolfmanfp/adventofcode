class Day01 {
    private val list = readInput("day01")
    private val numList = list.map(String::trim).map{it.toInt()}

    fun solvePartOne(): Int {
        return numList.filterIndexed { i, num ->
            if (i == 0) false else {
                num > numList[i-1]
            }}.count()
    }

    fun solvePartTwo(): Int {
        val slidingWindow = numList.mapIndexed { i, _ ->
            if (i < numList.size - 2) {
                numList[i] + numList[i + 1] + numList[i + 2]
            } else 0
        }
        return slidingWindow.filterIndexed { i, num ->
            if (i == 0) false else {
                num > slidingWindow[i-1]
            }}.count()
    }
}
