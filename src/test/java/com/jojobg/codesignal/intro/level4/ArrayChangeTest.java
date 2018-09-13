package com.jojobg.codesignal.intro.level4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayChangeTest {

    @Test
    public void test1() {
        assertEquals(3, ArrayChange.arrayChange(new int[]{1, 1, 1}));
    }

    @Test
    public void test2() {
        assertEquals(5, ArrayChange.arrayChange(new int[]{-1000, 0, -2, 0}));
    }

    @Test
    public void test3() {
        assertEquals(12, ArrayChange.arrayChange(new int[]{2, 1, 10, 1}));
    }

    @Test
    public void test4() {
        assertEquals(13, ArrayChange.arrayChange(new int[]{2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15}));
    }

}
