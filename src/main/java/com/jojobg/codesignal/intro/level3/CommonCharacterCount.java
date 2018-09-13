package com.jojobg.codesignal.intro.level3;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings, find the number of common characters between them.
 * 
 * Example
 * 
 * For s1 = "aabcc" and s2 = "adcaa", the output should be commonCharacterCount(s1, s2) = 3.
 * 
 * Strings have 3 common characters - 2 "a"s and 1 "c".
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] string s1
 * 
 * A string consisting of lowercase English letters.
 * 
 * Guaranteed constraints: 1 ≤ s1.length ≤ 15.
 * 
 * [input] string s2
 * 
 * A string consisting of lowercase English letters.
 * 
 * Guaranteed constraints: 1 ≤ s2.length ≤ 15.
 * 
 * [output] integer
 */
public class CommonCharacterCount {

    public static int commonCharacterCount(String s1, String s2) {
        List<String> chars = new ArrayList<String>();
        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < s1.length(); ++i) {
            String ch = s1.substring(i, i + 1);
            int startIdx = -1;
            if (chars.contains(ch)) {
                startIdx = chars.lastIndexOf(ch);
                startIdx = indexes.get(startIdx);
            }
            if (startIdx + 1 < s2.length()) {
                for (int j = startIdx + 1; j < s2.length(); ++j) {
                    if (ch.equals(s2.substring(j, j + 1))) {
                        chars.add(ch);
                        indexes.add(j);
                        break;
                    }
                }
            }
        }
        return chars.size();
    }
}
