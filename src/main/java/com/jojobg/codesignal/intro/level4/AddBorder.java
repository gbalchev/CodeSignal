package com.jojobg.codesignal.intro.level4;

/**
 * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
 * 
 * Example
 * 
 * For
 * 
 * picture = ["abc", 
 *            "ded"] 
 * 
 * the output should be
 * 
 * addBorder(picture) = ["*****", 
 *                       "*abc*", 
 *                       "*ded*", 
 *                       "*****"]
 *                      
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] array.string picture
 * 
 * A non-empty array of non-empty equal-length strings.
 * 
 * Guaranteed constraints: 
 *          1 ≤ picture.length ≤ 100, 
 *          1 ≤ picture[i].length ≤ 100.
 * 
 * [output] array.string
 * 
 * The same matrix of characters, framed with a border of asterisks of width 1.
 */
public class AddBorder {

    public static String[] addBorder(String[] picture) {
        int l1 = picture[0].length();
        int l2 = picture.length;
        String [] result = new String[l2 + 2];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l1 + 2; ++i) {
            sb.append('*');
        }
        result[0] = sb.toString();
        result [l2 + 1] = sb.toString();
        for (int j = 0; j < l2; ++j) {
            result[j + 1] = "*" + picture[j] + "*";
        }
        return result;
    }
}
