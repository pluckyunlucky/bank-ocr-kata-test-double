package bank.ocr.kata.testdouble;

import java.util.HashMap;
import java.util.function.Supplier;

public class Key {
    public static String firstMatchZeroOneSixEight = " ||";
    public static String secondMatchZero = "_ _";
    public static String secondMatchOne = "   ";
    public static String secondMatchSixEight = "___";
    public static String thirdMatchEight = " ||";


    public static String firstMatchFirstFiveNine = " | ";
    public static String firstMatchThreeSeven = "   ";
    public static String matchTwo = "  |";
    public static String matchFour = "|  ";

    public static HashMap<String, Integer> generateFirstMatchKey() {
        HashMap<String, Integer> key = new HashMap<>();
        key.put(matchTwo, 2);
        key.put(matchFour, 4);
        return key;
    };
    public static HashMap<String, Integer> generateSecondMatchKey(String previousMatch) {
        if (previousMatch.equals(firstMatchZeroOneSixEight)) {
            HashMap<String, Integer> secondaryMatch = new HashMap<>();
            secondaryMatch.put(secondMatchZero, 0);
            secondaryMatch.put(secondMatchOne, 1);
            return secondaryMatch;
        } else if (previousMatch.equals(firstMatchFirstFiveNine)) {
            HashMap<String, Integer> secondaryMatch = new HashMap<>();
            return secondaryMatch;
        } else if (previousMatch.equals(firstMatchThreeSeven)) {
            HashMap<String, Integer> secondaryMatch = new HashMap<>();
            return secondaryMatch;
        }
        throw new IllegalStateException("Unexpected value: " + previousMatch);


    };




}
