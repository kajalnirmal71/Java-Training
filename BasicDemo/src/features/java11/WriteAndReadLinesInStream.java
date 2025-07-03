package features.java11;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class WriteAndReadLinesInStream {


        public static void main(String[] args) {
            Path filePath = Path.of("data.txt");

            // Step 1: Create a list
            List<String> linesToWrite = List.of(
                    "Java is powerful.",
                    "Streams are useful.",
                    "Files API is simple in Java 11.",
                    "Optional avoids null checks.",
                    "Var improves readability.",
                    "Java 11 has new String methods.",
                    "Lambda got var in parameters.",
                    "Local variable syntax is better.",
                    "Modern Java is concise.",
                    "Happy coding with Java 11!"
            );

            try {
                // Write list of lines to the file
                Files.write(filePath, linesToWrite);
                System.out.println(" Lines written using Files.write(Path, List)");

                // Step 2: Read the file line-by-line using Stream
                System.out.println("\n Reading file content using Files.lines():");
                try (Stream<String> lines = Files.lines(filePath)) {
                    lines.forEach(System.out::println);
                }

            } catch (IOException e) {
                System.err.println(" Error: " + e.getMessage());
            }
        }
    }



