package ikg;

import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {
    @Test
    public void test1() {
        var a = new int[] { 2, 1, 3, 5, 4 };
        var sorter = new HerrTammInsertionSort2();
        sorter.sort(a);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, a);
    }

    @Test
    public void test2() {
        var a = new int[] { 2, 1, 1, 2, 1 };
        var sorter = new HerrTammInsertionSort2();
        sorter.sort(a);
        assertArrayEquals(new int[] { 1, 1, 1, 2, 2 }, a);
    }
}
