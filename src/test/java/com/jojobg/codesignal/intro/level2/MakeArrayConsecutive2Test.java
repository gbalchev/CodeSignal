package com.jojobg.codesignal.intro.level2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakeArrayConsecutive2Test {

    @Test
    public void tes1() {
        assertEquals(3, MakeArrayConsecutive2.makeArrayConsecutive2(new int[]{6, 2, 3, 8}));
    }

    @Test
    public void tes2() {
        assertEquals(2, MakeArrayConsecutive2.makeArrayConsecutive2(new int[]{0, 3}));
    }

    @Test
    public void tes3() {
        assertEquals(0, MakeArrayConsecutive2.makeArrayConsecutive2(new int[]{5, 4, 6}));
    }

    @Test
    public void tes4() {
        assertEquals(2, MakeArrayConsecutive2.makeArrayConsecutive2(new int[]{6, 3}));
    }

    @Test
    public void tes5() {
        assertEquals(0, MakeArrayConsecutive2.makeArrayConsecutive2(new int[]{1}));
    }

}
