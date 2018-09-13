package com.jojobg.codesignal.intro.level4;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeRearrangingTest {

    @Test
    public void test01() {
        assertEquals(true, PalindromeRearranging.palindromeRearranging("aabb"));
    }

    @Test
    public void test02() {
        assertEquals(false, PalindromeRearranging.palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
    }

    @Test
    public void test03() {
        assertEquals(true, PalindromeRearranging.palindromeRearranging("abbcabb"));
    }

    @Test
    public void test04() {
        assertEquals(true, PalindromeRearranging.palindromeRearranging("zyyzzzzz"));
    }

    @Test
    public void test05() {
        assertEquals(true, PalindromeRearranging.palindromeRearranging("z"));
    }

    @Test
    public void test06() {
        assertEquals(true, PalindromeRearranging.palindromeRearranging("zaa"));
    }

    @Test
    public void test07() {
        assertEquals(false, PalindromeRearranging.palindromeRearranging("abca"));
    }

    @Test
    public void test08() {
        assertEquals(false, PalindromeRearranging.palindromeRearranging("abcad"));
    }

    @Test
    public void test09() {
        assertEquals(false, PalindromeRearranging.palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa"));
    }

    @Test
    public void test10() {
        assertEquals(false, PalindromeRearranging.palindromeRearranging("abdhuierf"));
    }

    @Test
    public void test11() {
        assertEquals(false, PalindromeRearranging.palindromeRearranging("abbbccaa"));
    }

}
