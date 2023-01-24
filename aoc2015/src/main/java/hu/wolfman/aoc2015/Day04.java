package hu.wolfman.aoc2015;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.List;

public class Day04 implements Day {
    private static final String FILENAME = "day04.txt";

    @Override
    public String getFilename() {
        return FILENAME;
    }

    @Override
    public Long solvePartOne(List<String> input) {
        return findNumber(input, "00000");
    }

    @Override
    public Long solvePartTwo(List<String> input) {
        return findNumber(input, "000000");
    }

    private static long findNumber(List<String> input, String startsWith) {
        String joinedInput = String.join("", input);
        boolean found = false;
        long i = 0;

        while (!found) {
            String test = joinedInput + ++i;
            found = DigestUtils.md5Hex(test).startsWith(startsWith);
        }
        return i;
    }
}
