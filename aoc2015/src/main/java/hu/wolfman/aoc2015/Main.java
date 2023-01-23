package hu.wolfman.aoc2015;

import java.util.List;

public class Main {

    public static void main(String... args) {
        Day day = new Day03();
        List<String> lines = ResourceReader.readInput(day.getFilename());
        System.out.println(day.solvePartOne(lines));
        System.out.println(day.solvePartTwo(lines));
    }

}
