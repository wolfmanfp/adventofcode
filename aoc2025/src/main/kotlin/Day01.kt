class Day01 : IDay {
    override fun solvePartOne(list: List<String>): Int {
        var dial = 50
        var zeroCount = 0
        for (str in list) {
            val state = rotateDial(dial, str)
            dial = state.dial
            if (dial == 0) zeroCount++
        }
        return zeroCount
    }

    override fun solvePartTwo(list: List<String>): Int {
        var dial = 50
        var zeroCount = 0
        for (str in list) {
            val state = rotateDial(dial, str)
            dial = state.dial
            zeroCount += state.timesPointedAtZero
        }
        return zeroCount
    }

    fun rotateDial(prev: Int, cmd: String): DialState {
        var dial = prev
        var rotation = 0
        var pointedAtZero = 0

        if (cmd.startsWith("L")) {
            rotation = cmd.substring(1).toInt() * -1
        } else if (cmd.startsWith("R")) {
            rotation = cmd.substring(1).toInt()
        }

        if (rotation > 0) {
            for (i in 0 until rotation) {
                dial++
                if (dial % 100 == 0) {
                    pointedAtZero++
                }
            }
        } else if (rotation < 0) {
            for (i in rotation until 0) {
                dial--
                if (dial % 100 == 0) {
                    pointedAtZero++
                }
            }
            dial += 100
        }

        return DialState(dial % 100, pointedAtZero)
    }

data class DialState(val dial: Int, val timesPointedAtZero: Int)
}
