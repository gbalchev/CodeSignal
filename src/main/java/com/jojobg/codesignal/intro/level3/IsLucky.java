package com.jojobg.codesignal.intro.level3;

import java.util.ArrayList;
import java.util.List;

/**
 * Ticket numbers usually consist of an even number of digits. 
 * A ticket number is considered lucky if the sum of the first half of the
 * digits is equal to the sum of the second half.
 * 
 * Given a ticket number n, determine if it's lucky or not.
 * 
 * Example
 * 
 * For n = 1230, the output should be isLucky(n) = true; 
 * For n = 239017, the output should be isLucky(n) = false. 
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] integer n
 * 
 * A ticket number represented as a positive integer with an even number of digits.
 * 
 * Guaranteed constraints: 10 ≤ n < 10^6.
 * 
 * [output] boolean
 * 
 * true if n is a lucky ticket number, false otherwise.
 */
public class IsLucky {

    public static boolean isLucky(int n) {
        List<Integer> digits = new ArrayList<Integer>();
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            digits.add(digit);
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < digits.size() / 2; ++i) {
            sum1 += digits.get(i);
            sum2 += digits.get(digits.size() - i - 1);
        }
        return sum1 == sum2;
    }
}
