package hu.wolfman.aoc2015;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class ResourceReader {

    private ResourceReader() {
    }

    public static List<String> readInput(String filename) {
        try {
            URL resource = ResourceReader.class.getClassLoader().getResource(filename);
            URI fileUri = Objects.requireNonNull(resource).toURI();
            return Files.readAllLines(Paths.get(fileUri));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}
