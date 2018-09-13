package com.jojobg.codesignal.intro.level2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdjacentElementsProductTest {

    @Test
    public void test1() {
        assertEquals(21,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3}));
    }

    @Test
    public void test2() {
        assertEquals(2,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{-1, -2}));
    }

    @Test
    public void test3() {
        assertEquals(6,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{5, 1, 2, 3, 1, 4}));
    }

    @Test
    public void test4() {
        assertEquals(6,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{1, 2, 3, 0}));
    }

    @Test
    public void test5() {
        assertEquals(50,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
    }

    @Test
    public void test6() {
        assertEquals(30,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{5, 6, -4, 2, 3, 2, -23}));
    }

    @Test
    public void test7() {
        assertEquals(6,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{4, 1, 2, 3, 1, 5}));
    }

    @Test
    public void test8() {
        assertEquals(-12,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{-23, 4, -3, 8, -12}));
    }

    @Test
    public void test9() {
        assertEquals(0,  AdjacentElementsProduct.adjacentElementsProduct(new int[]{1, 0, 1, 0, 1000}));
    }

}
