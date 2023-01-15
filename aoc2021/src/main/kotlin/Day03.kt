class Day03 {
    companion object {
        fun solvePartOne(input: List<String>): Int {
            val matrix = input.map { it -> it.chunked(1).map { numStr -> numStr.toInt().toBoolean() } }
            val transposedMatrix: MutableList<List<Boolean>> = ArrayList()
            for (x in matrix[0].indices) {
                val list: MutableList<Boolean> = ArrayList()
                for (y in matrix.indices) {
                    list.add(matrix[y][x])
                }
                transposedMatrix.add(list)
            }
            val mostCommonValue: List<Boolean?> = transposedMatrix.map { list -> list.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key }
            val gamma = mostCommonValue.joinToString("") { it -> it?.toInt().toString() }.toInt(2)
            val epsilon = mostCommonValue.joinToString("") { it -> it?.not()?.toInt().toString() }.toInt(2)

            return gamma * epsilon;
        }

        fun solvePartTwo(input: List<String>): Int {
            return 0;
        }
    }
}