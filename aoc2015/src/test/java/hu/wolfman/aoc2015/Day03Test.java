package hu.wolfman.aoc2015;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03Test {

    @Test
    public void testPartOne() {
        Day day = new Day03();
        assertEquals(2, day.solvePartOne(Collections.singletonList(">")));
        assertEquals(4, day.solvePartOne(Collections.singletonList("^>v<")));
        assertEquals(2, day.solvePartOne(Collections.singletonList("^v^v^v^v^v")));
    }

    @Test
    public void testPartTwo() {
        Day day = new Day03();
        assertEquals(3, day.solvePartTwo(Collections.singletonList("^v")));
        assertEquals(3, day.solvePartTwo(Collections.singletonList("^>v<")));
        assertEquals(11, day.solvePartTwo(Collections.singletonList("^v^v^v^v^v")));
    }


}
