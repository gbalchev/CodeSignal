package com.jojobg.codesignal.intro.level1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CenturyFromYearTest {

    @Test
    public void test1() {
        assertEquals(20, CenturyFromYear.centuryFromYear(1905));
    }

    @Test
    public void test2() {
        assertEquals(17, CenturyFromYear.centuryFromYear(1700));
    }

    @Test
    public void test3() {
        assertEquals(20, CenturyFromYear.centuryFromYear(1988));
    }

    @Test
    public void test4() {
        assertEquals(20, CenturyFromYear.centuryFromYear(2000));
    }

    @Test
    public void test5() {
        assertEquals(21, CenturyFromYear.centuryFromYear(2001));
    }

    @Test
    public void test6() {
        assertEquals(2, CenturyFromYear.centuryFromYear(200));
    }

    @Test
    public void test7() {
        assertEquals(4, CenturyFromYear.centuryFromYear(374));
    }

    @Test
    public void test8() {
        assertEquals(1, CenturyFromYear.centuryFromYear(45));
    }

    @Test
    public void test9() {
        assertEquals(1, CenturyFromYear.centuryFromYear(8));
    }

}
