import kotlin.test.Test
import kotlin.test.assertEquals

class Day01Test {
    @Test
    fun testPartOne() {
        val list = readInput("day01test")
        val day01 = Day01()
        assertEquals(3, day01.solvePartOne(list))
    }

    @Test
    fun testPartTwo() {
        val list = readInput("day01test")
        val day01 = Day01()
        assertEquals(6, day01.solvePartTwo(list))
    }

    @Test
    fun testRotateDial01() {
        assertEquals(Day01.DialState(82, true), Day01().rotateDial(50, "L68"))
    }

    @Test
    fun testRotateDial02() {
        assertEquals(Day01.DialState(52, false), Day01().rotateDial(82, "L30"))
    }

    @Test
    fun testRotateDial03() {
        assertEquals(Day01.DialState(0, true), Day01().rotateDial(52, "R48"))
    }

    @Test
    fun testRotateDial04() {
        assertEquals(Day01.DialState(95, false), Day01().rotateDial(0, "L5"))
    }

    @Test
    fun testRotateDial05() {
        assertEquals(Day01.DialState(55, true), Day01().rotateDial(95, "R60"))
    }

    @Test
    fun testRotateDial06() {
        assertEquals(Day01.DialState(0, true), Day01().rotateDial(55, "L55"))
    }

    @Test
    fun testRotateDial07() {
        assertEquals(Day01.DialState(99, false), Day01().rotateDial(0, "L1"))
    }

    @Test
    fun testRotateDial08() {
        assertEquals(Day01.DialState(0, true), Day01().rotateDial(99, "L99"))
    }

    @Test
    fun testRotateDial09() {
        assertEquals(Day01.DialState(14, false), Day01().rotateDial(0, "R14"))
    }

    @Test
    fun testRotateDial10() {
        assertEquals(Day01.DialState(32, true), Day01().rotateDial(14, "L82"))
    }
}