package com.jojobg.codesignal.intro.level3;

import java.util.LinkedList;
import java.util.List;

/**
 * Given an array of strings, return another array containing all of its longest strings.
 * 
 * Example
 * 
 * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], 
 * the output should be allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] array.string inputArray
 * 
 * A non-empty array.
 * 
 * Guaranteed constraints: 
 *          1 ≤ inputArray.length ≤ 10, 
 *          1 ≤ inputArray[i].length ≤ 10.
 * 
 * [output] array.string
 * 
 * Array of the longest strings, stored in the same order as in the inputArray.
 */
public class AllLongestStrings {

    public static String[] allLongestStrings(String[] inputArray) {
        List<String> longest = new LinkedList<String>();
        int maxLength = 0;

        for (String string : inputArray) {
            int length = string.length();

            if (length < maxLength) {
                continue;
            }

            if (length > maxLength) {
                maxLength = length;
                longest.clear();
            }

            longest.add(string);
        }

        return longest.toArray(new String[longest.size()]);
    }
}
