package com.jojobg.codesignal.intro.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Some people are standing in a row in a park. There are trees between them 
 * which cannot be moved. Your task is to rearrange the people by their heights 
 * in a non-descending order without moving the trees. People can be very tall!
 * 
 * Example
 * 
 * For a = [-1, 150, 190, 170, -1, -1, 160, 180], 
 * the output should be sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] array.integer a
 * 
 * If a[i] = -1, then the i^th position is occupied by a tree. 
 * Otherwise a[i] is the height of a person standing in the i^th position.
 * 
 * Guaranteed constraints: 
 *          1 ≤ a.length ≤ 1000, 
 *          -1 ≤ a[i] ≤ 1000.
 * 
 * [output] array.integer
 * 
 * Sorted array a with all the trees untouched.
 */
public class SortByHeight {

    public static int[] sortByHeight(int[] a) {
        List<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > -1)
                sorted.add(a[i]);
        }
        Integer[] s = {};
        s = sorted.toArray(s);
        Arrays.sort(s);
        int j = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > -1)
                a[i] = s[j++];
        }
        return a;
    }
}
