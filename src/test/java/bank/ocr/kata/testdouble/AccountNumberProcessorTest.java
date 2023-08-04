/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bank.ocr.kata.testdouble;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountNumberProcessorTest {
    String inputRepresentation = """
            
              |
              |
            """;
    String multipleInputRepresentation = "";

    @Test void canParseIntoInternalRepresenationFromFile() throws IOException, URISyntaxException {
        Class<AccountNumberProcessorTest> currentClass = AccountNumberProcessorTest.class;
        URI testFile = currentClass.getResource("/TestCase0.txt").toURI();
        List<List<String>> expectedRepresentation = new ArrayList<>();
        expectedRepresentation.add(List.of(
                " ","_"," "," ","_"," "," ","_"," "," ","_"," "," ","_"," "," ",
                "_"," "," ","_"," "," ","_"," "," ","_"));
        expectedRepresentation.add(List.of("|"," ","|","|", " ","|","|",
                " ","|","|"," ","|","|"," ","|","|"," ","|","|"," ", "|", "|",
                " ", "|", "|"," ","|"));
        expectedRepresentation.add(List.of("|","_","|","|","_","|","|","_","|","|","_",
                "|","|","_","|","|","_","|","|","_","|","|","_","|","|","_","|"));
        expectedRepresentation.add(List.of(""));
        expectedRepresentation.add(List.of(""));
        expectedRepresentation.add(List.of(""));

        AccountNumberProcessor processor = new AccountNumberProcessor();
        List<List<String>> actualRepresentation = processor.convertToList(Path.of(testFile));
        assertIterableEquals(expectedRepresentation, actualRepresentation);
    }

    @Test void canParseSingleRepresentationIntoInteger() {
        Integer expectedNumber = 1;
        AccountNumberProcessor processor = new AccountNumberProcessor();
        Integer actualNumber = processor.convertCharsToInteger(Collections.emptyList());
    }

    @Test void canParseLineIntoIntegers() {
        Integer expectedNumber = 123456789;
        AccountNumberProcessor processor = new AccountNumberProcessor();
    }

    @Test void canParseLinesFromFileIntoAccountNumbers(){

    }
}