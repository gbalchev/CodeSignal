package com.jojobg.codesignal.intro.level2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlmostIncreasingSequenceTest {

    @Test
    public void test01() {
        assertEquals(false, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 3, 2, 1}));
    }

    @Test
    public void test02() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 3, 2}));
    }

    @Test
    public void test03() {
        assertEquals(false, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 2, 1, 2}));
    }

    @Test
    public void test04() {
        assertEquals(false, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 4, 10, 4, 2}));
    }

    @Test
    public void test05() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{10, 1, 2, 3, 4, 5}));
    }

    @Test
    public void test06() {
        assertEquals(false, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 1, 1, 2, 3}));
    }

    @Test
    public void test07() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{0, -2, 5, 6}));
    }

    @Test
    public void test08() {
        assertEquals(false, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 2, 3, 4, 5, 3, 5, 6}));
    }

    @Test
    public void test09() {
        assertEquals(false, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{40, 50, 60, 10, 20, 30}));
    }

    @Test
    public void test10() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 1}));
    }

    @Test
    public void test11() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 2, 5, 3, 5}));
    }

    @Test
    public void test12() {
        assertEquals(false, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 2, 5, 5, 5}));
    }

    @Test
    public void test13() {
        assertEquals(false, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{10, 1, 2, 3, 4, 5, 6, 1}));
    }

    @Test
    public void test14() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 2, 3, 4, 3, 6}));
    }

    @Test
    public void test15() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{1, 2, 3, 4, 99, 5, 6}));
    }

    @Test
    public void test16() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{123, -17, -5, 1, 2, 3, 12, 43, 45}));
    }

    @Test
    public void test17() {
        assertEquals(true, AlmostIncreasingSequence.almostIncreasingSequence(new int[]{3, 5, 67, 98, 3}));
    }

}
