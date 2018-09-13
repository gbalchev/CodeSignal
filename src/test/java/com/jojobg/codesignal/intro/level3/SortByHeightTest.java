package com.jojobg.codesignal.intro.level3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortByHeightTest {

    @Test
    public void test1() {
        int[] expected = {-1, 150, 160, 170, -1, -1, 180, 190};
        int[] result = SortByHeight.sortByHeight(new int[]{-1, 150, 190, 170, -1, -1, 160, 180});
        assertEquals(8, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = {-1, -1, -1, -1, -1};
        int[] result = SortByHeight.sortByHeight(new int[]{-1, -1, -1, -1, -1});
        assertEquals(5, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = {-1};
        int[] result = SortByHeight.sortByHeight(new int[]{-1});
        assertEquals(1, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test4() {
        int[] expected = {2, 2, 4, 9, 11, 16};
        int[] result = SortByHeight.sortByHeight(new int[]{4, 2, 9, 11, 2, 16});
        assertEquals(6, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test5() {
        int[] expected = {1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2};
        int[] result = SortByHeight.sortByHeight(new int[]{2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1});
        assertEquals(14, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test6() {
        int[] expected = {1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77};
        int[] result = SortByHeight.sortByHeight(new int[]{23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3});
        assertEquals(12, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

}
