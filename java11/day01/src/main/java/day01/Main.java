package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void part1(String input) {
    int result = Solutions.solution1(input);
    logger.info("Part 01: " + result);
  }

  public static void part2(String input) {
    int result = Solutions.solution2(input);
    logger.info("Part 02: " + result);
  }

  public static void main(String[] args) throws IOException {
    Path path = Paths.get(args[0]);
    String input = Files.readString(path);
    part1(input);
    part2(input);
  }
}
