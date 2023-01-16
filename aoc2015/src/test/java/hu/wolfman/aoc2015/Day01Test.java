package hu.wolfman.aoc2015;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test {

    @Test
    public void testPartOne() {
        Day day = new Day01();
        assertEquals(0, day.solvePartOne(Collections.singletonList("(())")));
        assertEquals(0, day.solvePartOne(Collections.singletonList("()()")));
        assertEquals(3, day.solvePartOne(Collections.singletonList("(((")));
        assertEquals(3, day.solvePartOne(Collections.singletonList("(()(()(")));
        assertEquals(3, day.solvePartOne(Collections.singletonList("))(((((")));
        assertEquals(-1, day.solvePartOne(Collections.singletonList("())")));
        assertEquals(-1, day.solvePartOne(Collections.singletonList("))(")));
        assertEquals(-3, day.solvePartOne(Collections.singletonList(")))")));
        assertEquals(-3, day.solvePartOne(Collections.singletonList(")())())")));
    }

    @Test
    public void testPartTwo() {
        Day day = new Day01();
        assertEquals(1, day.solvePartTwo(Collections.singletonList(")")));
        assertEquals(5, day.solvePartTwo(Collections.singletonList("()())")));
    }

}
