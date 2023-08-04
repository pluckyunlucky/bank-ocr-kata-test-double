package bank.ocr.kata.testdouble;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class KeyTest {
    @Test
    void canMatchZeroInSecondMatch() {
        HashMap<String, Integer> key = Key.generateSecondMatchKey(" ||");
        assertEquals(0, key.get("_ _"));
    }
    @Test
    void canMatchOneInSecondMatch() {
        HashMap<String, Integer> key = Key.generateSecondMatchKey("   ");
        assertEquals(1, key.get("   "));
    }
    @Test
    void canMatchTwoInFirstMatch() {
        assertEquals("  |", Key.matchTwo);
    }

}