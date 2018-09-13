package com.jojobg.codesignal.intro.level3;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsLuckyTest {

    @Test
    public void test01() {
        assertEquals(true, IsLucky.isLucky(1230));
    }

    @Test
    public void test02() {
        assertEquals(false, IsLucky.isLucky(239017));
    }

    @Test
    public void test03() {
        assertEquals(true, IsLucky.isLucky(134008));
    }

    @Test
    public void test04() {
        assertEquals(false, IsLucky.isLucky(10));
    }

    @Test
    public void test05() {
        assertEquals(true, IsLucky.isLucky(11));
    }

    @Test
    public void test06() {
        assertEquals(true, IsLucky.isLucky(1010));
    }

    @Test
    public void test07() {
        assertEquals(false, IsLucky.isLucky(261534));
    }

    @Test
    public void test08() {
        assertEquals(false, IsLucky.isLucky(100000));
    }

    @Test
    public void test09() {
        assertEquals(true, IsLucky.isLucky(999999));
    }

    @Test
    public void test10() {
        assertEquals(true, IsLucky.isLucky(123321));
    }

}
