package com.jojobg.codesignal.intro.level1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

    @Test
    public void test1() {
        assertEquals(3, Add.add(1, 2));
    }

    @Test
    public void test2() {
        assertEquals(1000, Add.add(0, 1000));
    }

    @Test
    public void test3() {
        assertEquals(-37, Add.add(2, -39));
    }

    @Test
    public void test4() {
        assertEquals(199, Add.add(99, 100));
    }

    @Test
    public void test5() {
        assertEquals(0, Add.add(-100, 100));
    }

    @Test
    public void test6() {
        assertEquals(-2000, Add.add(-1000, -1000));
    }

}
