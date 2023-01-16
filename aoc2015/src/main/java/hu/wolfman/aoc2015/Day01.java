package hu.wolfman.aoc2015;

import java.util.List;

public class Day01 implements Day {

    private static final String FILENAME = "day01.txt";

    @Override
    public String getFilename() {
        return FILENAME;
    }

    @Override
    public Long solvePartOne(List<String> input) {
        String joinedInput = String.join("", input);
        long floor = 0;
        for (char c : joinedInput.toCharArray()) {
            switch (c) {
                case '(' -> floor++;
                case ')' -> floor--;
            }
        }
        return floor;
    }

    @Override
    public Long solvePartTwo(List<String> input) {
        String joinedInput = String.join("", input);
        long position = 0;
        long floor = 0;
        for (char c : joinedInput.toCharArray()) {
            switch (c) {
                case '(' -> floor++;
                case ')' -> floor--;
            }
            position++;
            if (floor == -1) {
                return position;
            }
        }
        return position;
    }
}
