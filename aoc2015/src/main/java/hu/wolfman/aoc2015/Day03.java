package hu.wolfman.aoc2015;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day03 implements Day {

    private static final String FILENAME = "day03.txt";

    @Override
    public String getFilename() {
        return FILENAME;
    }

    @Override
    public Long solvePartOne(List<String> input) {
        Set<Coordinate> coordinates = calculateCoordinates(String.join("", input));
        return (long) coordinates.size();
    }

    @Override
    public Long solvePartTwo(List<String> input) {
        char[] joinedInputArray = String.join("", input).toCharArray();
        StringBuilder santaInput = new StringBuilder();
        StringBuilder roboSantaInput = new StringBuilder();
        for (int i = 0; i < joinedInputArray.length; i++) {
            char c = joinedInputArray[i];
            if (i % 2 == 0) {
                santaInput.append(c);
            } else {
                roboSantaInput.append(c);
            }
        }

        Set<Coordinate> coordinates = calculateCoordinates(santaInput.toString());
        coordinates.addAll(calculateCoordinates(roboSantaInput.toString()));
        return (long) coordinates.size();
    }

    private Set<Coordinate> calculateCoordinates(String input) {
        Set<Coordinate> coordinates = new HashSet<>();
        long x = 0;
        long y = 0;
        coordinates.add(new Coordinate(x, y));

        String joinedInput = String.join("", input);
        for (char c : joinedInput.toCharArray()) {
            switch (c) {
                case '^' -> y++;
                case 'v' -> y--;
                case '<' -> x--;
                case '>' -> x++;
            }
            coordinates.add(new Coordinate(x, y));
        }
        return coordinates;
    }

    private record Coordinate(Long x, Long y) { }

}
