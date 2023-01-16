package hu.wolfman.aoc2015;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public interface Day {

    String getFilename();
    Long solvePartOne(List<String> input);
    Long solvePartTwo(List<String> input);

}
