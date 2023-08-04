package bank.ocr.kata.testdouble;

import java.util.HashMap;

public class Key {
    public static String firstMatchZeroSixEight = " ||";
    public static String secondMatchZero = "_ _";
    public static String secondMatchOne = "   ";
    public static String secondMatchSixEight = "___";
    public static String thirdMatchEight = " ||";
    public static String firstMatchFirstFourFiveNine = " | ";
    public static String secondMatchFour = " _ ";
    public static String firstMatchOneThreeSeven = "   ";
    public static String matchTwo = "  |";


    public static HashMap<String, Integer> generateSecondMatchKey(String previousMatch) {
        if (previousMatch.equals(firstMatchZeroSixEight)) {
            HashMap<String, Integer> secondaryMatch = new HashMap<>();
            secondaryMatch.put(secondMatchZero, 0);
            return secondaryMatch;
        } else if (previousMatch.equals(firstMatchFirstFourFiveNine)) {
            HashMap<String, Integer> secondaryMatch = new HashMap<>();
            return secondaryMatch;
        } else if (previousMatch.equals(firstMatchOneThreeSeven)) {
            HashMap<String, Integer> secondaryMatch = new HashMap<>();
            secondaryMatch.put(secondMatchOne, 1);
            return secondaryMatch;
        }
        throw new IllegalStateException("Unexpected value: " + previousMatch);


    };




}
