import org.junit.Test
import kotlin.test.assertEquals

class Day03Test {
    @Test
    fun testPartOne() {
        val list = readInput("day03test")
        assertEquals(198, Day03.solvePartOne(list))
    }

    @Test
    fun testPartTwo() {
        val list = readInput("day03test")
        assertEquals(230, Day03.solvePartTwo(list))
    }
}