/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bank.ocr.kata.testdouble;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AccountNumberProcessor {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new AccountNumberProcessor().getGreeting());
    }

    public Integer convertCharsToInteger(List<String> inputString) {
        return null;
    }

    public List<List<String>> convertToList(Path filePath) throws IOException {
        try (Stream<String> lines = Files.lines(filePath)) {
            Stream<List<String>> splitLinesStream =
                    lines.map(line -> Arrays.stream(line.split("")).toList());
            return splitLinesStream.toList();
        }
    }
}
