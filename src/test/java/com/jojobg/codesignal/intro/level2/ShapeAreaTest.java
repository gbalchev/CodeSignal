package com.jojobg.codesignal.intro.level2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeAreaTest {

    @Test
    public void test1() {
        assertEquals(5, ShapeArea.shapeArea(2));
    }

    @Test
    public void test2() {
        assertEquals(13, ShapeArea.shapeArea(3));
    }

    @Test
    public void test3() {
        assertEquals(1, ShapeArea.shapeArea(1));
    }

    @Test
    public void test4() {
        assertEquals(41, ShapeArea.shapeArea(5));
    }

    @Test
    public void test5() {
        assertEquals(85, ShapeArea.shapeArea(7));
    }

}
