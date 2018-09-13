package com.jojobg.codesignal.intro.level3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseParenthesesTest {

    @Test
    public void test1() {
        String input = "a(bc)de";
        String expected = "acbde";
        assertEquals(expected, ReverseParentheses.reverseParentheses(input));
    }

    @Test
    public void test2() {
        String input = "a(bcdefghijkl(mno)p)q";
        String expected = "apmnolkjihgfedcbq";
        assertEquals(expected, ReverseParentheses.reverseParentheses(input));
    }

    @Test
    public void test3() {
        String input = "co(de(fight)s)";
        String expected = "cosfighted";
        assertEquals(expected, ReverseParentheses.reverseParentheses(input));
    }

    @Test
    public void test4() {
        String input = "Code(Cha(lle)nge)";
        String expected = "CodeegnlleahC";
        assertEquals(expected, ReverseParentheses.reverseParentheses(input));
    }

    @Test
    public void test5() {
        String input = "Where are the parentheses?";
        String expected = "Where are the parentheses?";
        assertEquals(expected, ReverseParentheses.reverseParentheses(input));
    }

    @Test
    public void test6() {
        String input = "abc(cba)ab(bac)c";
        String expected = "abcabcabcabc";
        assertEquals(expected, ReverseParentheses.reverseParentheses(input));
    }

    @Test
    public void test7() {
        String input = "The ((quick (brown) (fox) jumps over the lazy) dog)";
        String expected = "The god quick nworb xof jumps over the lazy";
        assertEquals(expected, ReverseParentheses.reverseParentheses(input));
    }

}
