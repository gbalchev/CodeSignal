package com.jojobg.codesignal.intro.level4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlternatingSumsTest {

    @Test
    public void test1() {
        int[] input = {50, 60, 60, 45, 70};
        int[] expected = {180, 105};
        int[] result = AlternatingSums.alternatingSums(input);
        assertEquals(2, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test2() {
        int[] input = {100, 50};
        int[] expected = {100, 50};
        int[] result = AlternatingSums.alternatingSums(input);
        assertEquals(2, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test3() {
        int[] input = {80};
        int[] expected = {80, 0};
        int[] result = AlternatingSums.alternatingSums(input);
        assertEquals(2, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test4() {
        int[] input = {100, 50, 50, 100};
        int[] expected = {150, 150};
        int[] result = AlternatingSums.alternatingSums(input);
        assertEquals(2, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test5() {
        int[] input = {100, 51, 50, 100};
        int[] expected = {150, 151};
        int[] result = AlternatingSums.alternatingSums(input);
        assertEquals(2, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

}
