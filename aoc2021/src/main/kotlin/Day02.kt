class Day02 {
    companion object {
        fun solvePartOne(input: List<String>): Int {
            val position = SubmarinePosition()
            input.map { it.split(" ") }.forEach {
                when (it[0]) {
                    "forward" -> position.horizontal += it[1].toInt()
                    "down" -> position.depth += it[1].toInt()
                    "up" -> position.depth -= it[1].toInt()
                }
            }
            return position.horizontal * position.depth
        }

        fun solvePartTwo(input: List<String>): Int {
            val position = SubmarinePosition()
            input.map { it.split(" ") }.forEach {
                val num = it[1].toInt()
                when (it[0]) {
                    "forward" -> {
                        position.horizontal += num
                        position.depth += position.aim * num
                    }
                    "down" -> position.aim += num
                    "up" -> position.aim -= num
                }
            }
            return position.horizontal * position.depth
        }
    }

    data class SubmarinePosition(var horizontal: Int = 0, var depth: Int = 0, var aim: Int = 0)
}