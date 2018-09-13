package com.jojobg.codesignal.intro.level4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jojobg.codesignal.intro.level3.AllLongestStrings;

public class AddBorderTest {

    @Test
    public void test1() {
        String[] input = { "abc", 
                           "ded" };

        String[] expected = { "*****", 
                              "*abc*", 
                              "*ded*", 
                              "*****" };

        String[] result = AddBorder.addBorder(input);

        assertEquals(4, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test2() {
        String[] input = { "a" };

        String[] expected = { "***", 
                              "*a*", 
                              "***" };

        String[] result = AddBorder.addBorder(input);

        assertEquals(3, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test3() {
        String[] input = { "aa", 
                           "**", 
                           "zz" };

        String[] expected = { "****", 
                              "*aa*", 
                              "****", 
                              "*zz*", 
                              "****" };

        String[] result = AddBorder.addBorder(input);

        assertEquals(5, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test4() {
        String[] input = { "abcde", 
                           "fghij", 
                           "klmno", 
                           "pqrst", 
                           "uvwxy" };

        String[] expected = { "*******", 
                              "*abcde*", 
                              "*fghij*", 
                              "*klmno*", 
                              "*pqrst*", 
                              "*uvwxy*", 
                              "*******" };

        String[] result = AddBorder.addBorder(input);

        assertEquals(7, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test5() {
        String[] input = { "wzy**" };

        String[] expected = { "*******", 
                              "*wzy***", 
                              "*******" };

        String[] result = AddBorder.addBorder(input);

        assertEquals(3, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

}
