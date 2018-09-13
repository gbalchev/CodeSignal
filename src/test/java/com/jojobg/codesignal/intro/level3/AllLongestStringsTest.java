package com.jojobg.codesignal.intro.level3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllLongestStringsTest {

    @Test
    public void test1() {
        String[] input = {"aba", 
                          "aa", 
                          "vcd", 
                          "aba"};
        
        String[] expected = {"aba", 
                             "vcd", 
                             "aba"};
        
        String[] result = AllLongestStrings.allLongestStrings(input);
        
        assertEquals(3, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }
    
    @Test
    public void test2() {
        String[] input = {"aa"};
        
        String[] expected = {"aa"};

        String[] result = AllLongestStrings.allLongestStrings(input);
        
        assertEquals(1, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test3() {
        String[] input = {"abc", 
                          "eeee", 
                          "abcd", 
                          "dcd"}; 
        
        String[] expected = {"eeee", 
                             "abcd"};
        
        String[] result = AllLongestStrings.allLongestStrings(input);
        
        assertEquals(2, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void test4() {
        String[] input = {"a", 
                          "abc", 
                          "cbd", 
                          "zzzzzz", 
                          "a", 
                          "abcdef", 
                          "asasa", 
                          "aaaaaa"};
        
        String[] expected = {"zzzzzz", 
                             "abcdef", 
                             "aaaaaa"};
        
        String[] result = AllLongestStrings.allLongestStrings(input);
        
        assertEquals(3, result.length);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(expected[i], result[i]);
        }
    }

}
