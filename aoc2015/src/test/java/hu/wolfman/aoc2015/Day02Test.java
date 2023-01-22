package hu.wolfman.aoc2015;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test {

    @Test
    public void testPartOne() {
        Day day = new Day02();
        assertEquals(58, day.solvePartOne(Collections.singletonList("2x3x4")));
        assertEquals(43, day.solvePartOne(Collections.singletonList("1x1x10")));
    }

    @Test
    public void testPartTwo() {
        Day day = new Day02();
        assertEquals(34, day.solvePartTwo(Collections.singletonList("2x3x4")));
        assertEquals(14, day.solvePartTwo(Collections.singletonList("1x1x10")));
    }
}
