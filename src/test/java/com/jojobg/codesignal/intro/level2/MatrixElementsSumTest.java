package com.jojobg.codesignal.intro.level2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixElementsSumTest {

    @Test
    public void test1() {
        assertEquals(9, MatrixElementsSum.matrixElementsSum(new int[][]{{0, 1, 1, 2}, 
                                                                        {0, 5, 0, 0}, 
                                                                        {2, 0, 3, 3}}));
    }

    @Test
    public void test2() {
        assertEquals(9, MatrixElementsSum.matrixElementsSum(new int[][]{{1, 1, 1,  0}, 
                                                                        {0, 5, 0,  1}, 
                                                                        {2, 1, 3, 10}}));
    }

    @Test
    public void test3() {
        assertEquals(18, MatrixElementsSum.matrixElementsSum(new int[][]{{1, 1, 1}, 
                                                                         {2, 2, 2}, 
                                                                         {3, 3, 3}}));
    }

    @Test
    public void test4() {
        assertEquals(0, MatrixElementsSum.matrixElementsSum(new int[][]{{0}}));
    }

}
