package hu.wolfman.aoc2015;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day04Test {

    @Test
    public void testPartOne() {
        Day day = new Day04();
        assertEquals(609043, day.solvePartOne(Collections.singletonList("abcdef")));
        assertEquals(1048970, day.solvePartOne(Collections.singletonList("pqrstuv")));
    }

}
