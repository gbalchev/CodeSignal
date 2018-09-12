package com.jojobg.codesignal.intro.level1;

/**
 * Given the string, check if it is a palindrome.
 * 
 * Example
 * 
 * For inputString = "aabaa", the output should be checkPalindrome(inputString) = true;
 * For inputString = "abac", the output should be checkPalindrome(inputString) = false;
 * For inputString = "a", the output should be checkPalindrome(inputString) = true. 
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] string inputString
 * 
 * A non-empty string consisting of lowercase characters.
 * 
 * Guaranteed constraints: 1 ≤ inputString.length ≤ 105.
 * 
 * [output] boolean
 * 
 * true if inputString is a palindrome, false otherwise.
 */
public class CheckPalindrome {

    public static boolean checkPalindrome(String s) {
        for (int i = 0; i <= s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

}
