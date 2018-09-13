package com.jojobg.codesignal.intro.level3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommonCharacterCountTest {

    @Test
    public void test1() {
        assertEquals(3, CommonCharacterCount.commonCharacterCount("aabcc", "adcaa"));
    }

    @Test
    public void test2() {
        assertEquals(4, CommonCharacterCount.commonCharacterCount("zzzz", "zzzzzzz"));
    }

    @Test
    public void test3() {
        assertEquals(3, CommonCharacterCount.commonCharacterCount("abca", "xyzbac"));
    }

    @Test
    public void test4() {
        assertEquals(0, CommonCharacterCount.commonCharacterCount("a", "b"));
    }

    @Test
    public void test5() {
        assertEquals(1, CommonCharacterCount.commonCharacterCount("a", "aaa"));
    }

}
