package hu.wolfman.aoc2015;

import java.util.Arrays;
import java.util.List;

public class Day02 implements Day {

    private static final String FILENAME = "day02.txt";

    @Override
    public String getFilename() {
        return FILENAME;
    }

    @Override
    public Long solvePartOne(List<String> input) {
        return input.stream()
                .map(this::calculatePaperSurface)
                .mapToLong(Long::longValue)
                .sum();
    }

    private Long calculatePaperSurface(String line) {
        List<Long> sides = Arrays.stream(line.split("x")).map(Long::parseLong).toList();
        List<Long> areas = Arrays.asList(
                sides.get(0) * sides.get(1),
                sides.get(0) * sides.get(2),
                sides.get(1) * sides.get(2)
        );
        Long minArea = areas.stream().min(Long::compareTo).get();
        return areas.stream().mapToLong(Long::longValue).sum() * 2 + minArea;
    }

    @Override
    public Long solvePartTwo(List<String> input) {
        return input.stream()
                .map(this::calculateRibbonLength)
                .mapToLong(Long::longValue)
                .sum();
    }

    private Long calculateRibbonLength(String line) {
        List<Long> sides = Arrays.stream(line.split("x")).map(Long::parseLong).toList();
        Long volume = sides.stream().reduce(1L, (a, b) -> a * b);
        List<Long> perimeters = Arrays.asList(
                2 * (sides.get(0) + sides.get(1)),
                2 * (sides.get(0) + sides.get(2)),
                2 * (sides.get(1) + sides.get(2))
        );
        Long minPerimeter = perimeters.stream().min(Long::compareTo).get();
        return minPerimeter + volume;
    }

}
