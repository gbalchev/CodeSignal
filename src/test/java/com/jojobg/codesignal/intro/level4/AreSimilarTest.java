package com.jojobg.codesignal.intro.level4;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreSimilarTest {

    @Test
    public void test01() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertEquals(true, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test02() {
        int[] a = {1, 2, 3};
        int[] b = {2, 1, 3};
        assertEquals(true, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test03() {
        int[] a = {1, 2, 2};
        int[] b = {2, 1, 1};
        assertEquals(false, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test04() {
        int[] a = {1, 1, 4};
        int[] b = {1, 2, 3};
        assertEquals(false, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test05() {
        int[] a = {1,  2, 3};
        int[] b = {1, 10, 2};
        assertEquals(false, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test06() {
        int[] a = {2, 3, 1};
        int[] b = {1, 3, 2};
        assertEquals(true, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test07() {
        int[] a = { 2, 3, 9};
        int[] b = {10, 3, 2};
        assertEquals(false, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test08() {
        int[] a = {4, 6, 3};
        int[] b = {3, 4, 6};
        assertEquals(false, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test09() {
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};
        assertEquals(true, AreSimilar.areSimilar(a, b));
    }

    @Test
    public void test10() {
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
        assertEquals(false, AreSimilar.areSimilar(a, b));
    }

}
