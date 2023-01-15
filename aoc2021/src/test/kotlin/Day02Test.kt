import kotlin.test.Test
import kotlin.test.assertEquals

class Day02Test {
    @Test
    fun testDay02() {
        val list = readInput("day02test")
        assertEquals(150, Day02.solvePartOne(list))
        assertEquals(900, Day02.solvePartTwo(list))
    }
}