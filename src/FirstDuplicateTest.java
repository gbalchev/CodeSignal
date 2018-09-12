import static org.junit.Assert.*;

import org.junit.Test;

public class FirstDuplicateTest {

    @Test
    public void test1() {
        assertEquals(3, FirstDuplicate.firstDuplicate(new int[]{2, 1, 3, 5, 3, 2}));
    }

    @Test
    public void test2() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{2, 4, 3, 5, 1}));
    }

    @Test
    public void test3() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{1}));
    }

    @Test
    public void test4() {
        assertEquals(2, FirstDuplicate.firstDuplicate(new int[]{2, 2}));
    }

    @Test
    public void test5() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{2, 1}));
    }

    @Test
    public void test6() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{2, 1, 3}));
    }

    @Test
    public void test7() {
        assertEquals(3, FirstDuplicate.firstDuplicate(new int[]{2, 3, 3}));
    }

    @Test
    public void test8() {
        assertEquals(3, FirstDuplicate.firstDuplicate(new int[]{3, 3, 3}));
    }

    @Test
    public void test9() {
        assertEquals(6, FirstDuplicate.firstDuplicate(new int[]{8, 4, 6, 2, 6, 4, 7, 9, 5, 8}));
    }

    @Test
    public void test10() {
        assertEquals(-1, FirstDuplicate.firstDuplicate(new int[]{10, 6, 8, 4, 9, 1, 7, 2, 5, 3}));
    }

    @Test
    public void test11() {
        assertEquals(1, FirstDuplicate.firstDuplicate(new int[]{1, 1, 2, 2, 1}));
    }

}
