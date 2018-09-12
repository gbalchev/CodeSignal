package com.jojobg.codesignal.arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class FirstDuplicateTest {

    @Test
    public void test01() {
        assertEquals(3, FirstDuplicate.firstDuplicate(new int[]{2, 1, 3, 5, 3, 2}));
    }

    @Test
    public void test02() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{2, 4, 3, 5, 1}));
    }

    @Test
    public void test03() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{1}));
    }

    @Test
    public void test04() {
        assertEquals(2, FirstDuplicate.firstDuplicate(new int[]{2, 2}));
    }

    @Test
    public void test05() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{2, 1}));
    }

    @Test
    public void test06() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{2, 1, 3}));
    }

    @Test
    public void test07() {
        assertEquals(3, FirstDuplicate.firstDuplicate(new int[]{2, 3, 3}));
    }

    @Test
    public void test08() {
        assertEquals(3, FirstDuplicate.firstDuplicate(new int[]{3, 3, 3}));
    }

    @Test
    public void test09() {
        assertEquals(6, FirstDuplicate.firstDuplicate(new int[]{8, 4, 6, 2, 6, 4, 7, 9, 5, 8}));
    }

    @Test
    public void test10() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{10, 6, 8, 4, 9, 1, 7, 2, 5, 3}));
    }

    @Test
    public void test11() {
        assertEquals(1, FirstDuplicate.firstDuplicate(new int[]{1, 1, 2, 2, 1}));
    }

}
