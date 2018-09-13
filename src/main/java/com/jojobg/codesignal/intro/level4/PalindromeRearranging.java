package com.jojobg.codesignal.intro.level4;

/**
 * Given a string, find out if its characters can be rearranged to form a palindrome.
 * 
 * Example
 * 
 * For inputString = "aabb", 
 * the output should be palindromeRearranging(inputString) = true.
 * 
 * We can rearrange "aabb" to make "abba", which is a palindrome.
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] string inputString
 * 
 * A string consisting of lowercase English letters.
 * 
 * Guaranteed constraints: 
 *          1 ≤ inputString.length ≤ 50.
 * 
 * [output] boolean
 * 
 * true if the characters of the inputString can be rearranged 
 * to form a palindrome, false otherwise.
 */
public class PalindromeRearranging {

    public static boolean palindromeRearranging(String inputString) {
        char[] chars = inputString.toCharArray();
        boolean even = (chars.length % 2) == 0;
        boolean middle = false;
        if (chars.length == 1) return true;
        for (int i = 0; i < chars.length / 2;) {
            char ch = chars[i];
            boolean swapped = false;
            for (int j = i + 1; j < chars.length - i; ++j) {
                if (ch == chars[j]) {
                    chars[j] = chars[chars.length - i - 1];
                    chars[chars.length - i - 1] = ch;
                    swapped = true;
                    break;
                }
            }
            if (swapped) ++i;
            else {
                if (even || middle) return false;
                chars[i] = chars[chars.length / 2];
                chars[chars.length / 2] = ch;
                middle = true;
            }
        }
        return true;
    }
}
