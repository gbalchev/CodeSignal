package com.jojobg.codesignal.intro.level1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPalindromeTest {

    @Test
    public void test01() {
        assertEquals(true, CheckPalindrome.checkPalindrome("aabaa"));
    }

    @Test
    public void test02() {
        assertEquals(false, CheckPalindrome.checkPalindrome("abac"));
    }

    @Test
    public void test03() {
        assertEquals(true, CheckPalindrome.checkPalindrome("a"));
    }

    @Test
    public void test04() {
        assertEquals(false, CheckPalindrome.checkPalindrome("az"));
    }

    @Test
    public void test05() {
        assertEquals(true, CheckPalindrome.checkPalindrome("abacaba"));
    }

    @Test
    public void test06() {
        assertEquals(true, CheckPalindrome.checkPalindrome("z"));
    }

    @Test
    public void test07() {
        assertEquals(false, CheckPalindrome.checkPalindrome("aaabaaaa"));
    }

    @Test
    public void test08() {
        assertEquals(false, CheckPalindrome.checkPalindrome("zzzazzazz"));
    }

    @Test
    public void test09() {
        assertEquals(true, CheckPalindrome.checkPalindrome("hlbeeykoqqqqokyeeblh"));
    }

    @Test
    public void test10() {
        assertEquals(true, CheckPalindrome.checkPalindrome("hlbeeykoqqqokyeeblh"));
    }

}
