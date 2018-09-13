package com.jojobg.codesignal.intro.level3;

/**
 * You have a string s that consists of English letters, punctuation marks, 
 * whitespace characters, and brackets. It is guaranteed that the
 * parentheses in s form a regular bracket sequence.
 * 
 * Your task is to reverse the strings contained in each pair of matching parentheses, 
 * starting from the innermost pair. The results string should not contain any parentheses.
 * 
 * Example
 * 
 * For string s = "a(bc)de", the output should be reverseParentheses(s) = "acbde".
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] string s
 * 
 * A string consisting of English letters, punctuation marks, 
 * whitespace characters and brackets. It is guaranteed that parentheses form a
 * regular bracket sequence.
 * 
 * Constraints: 5 ≤ s.length ≤ 55.
 * 
 * [output] string
 */
public class ReverseParentheses {

    public static String reverseParentheses(String s) {
        StringBuilder sb1 = new StringBuilder();
        int idx1 = 0;
        while (idx1 < s.length()) {
            if (s.charAt(idx1) != '(') {
                sb1.append(s.charAt(idx1++));
            } else {
                int idx2 = idx1 + 1;
                int p = 1;
                StringBuilder sb2 = new StringBuilder();
                while ((p > 0) && (idx2 < s.length())) {
                    if (s.charAt(idx2) == '(') {
                        p++;
                    } else if (s.charAt(idx2) == ')') {
                        p--;
                    }
                    idx2++;
                }
                sb2.append(reverseParentheses(s.substring(idx1+1, idx2-1)));
                sb2.reverse();
                sb1.append(sb2);
                idx1 = idx2;
            }
        }
        return sb1.toString();
    }
}
