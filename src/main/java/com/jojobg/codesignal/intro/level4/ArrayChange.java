package com.jojobg.codesignal.intro.level4;

/**
 * You are given an array of integers. On each move you are allowed 
 * to increase exactly one of its element by one. Find the minimal number
 * of moves required to obtain a strictly increasing sequence from the input.
 * 
 * Example
 * 
 * For inputArray = [1, 1, 1], 
 * the output should be arrayChange(inputArray) = 3.
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] array.integer inputArray
 * 
 * Guaranteed constraints: 
 *          3 ≤ inputArray.length ≤ 10^5, 
 *          -10^5 ≤ inputArray[i] ≤ 10^5.
 * 
 * [output] integer
 * 
 * The minimal number of moves needed to obtain a strictly increasing 
 * sequence from inputArray. It's guaranteed that for the given test
 * cases the answer always fits signed 32-bit integer type.
 */
public class ArrayChange {

    public static int arrayChange(int[] inputArray) {
        int r = 0;
        for (int i = 0; i < inputArray.length - 1; ++i) {
            if (inputArray[i] >= inputArray[i + 1]) {
                int dif = inputArray[i] - inputArray[i + 1] + 1;
                r += dif;
                inputArray[i + 1] += dif;
            }
        }
        return r;
    }
}