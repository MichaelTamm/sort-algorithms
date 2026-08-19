package ikg;

import java.util.Arrays;

public class HerrTammInsertionSort2 implements Sorter {
   
    public void sort(int[] a) {
        var n = a.length;
        int max = a[0];
        for (int i = 1; i < n; ++i) {
            int current = a[i];
            if (current > max) {
                max = current;
            } else {
                int j = Arrays.binarySearch(a, 0, i, current);    
                if (j < 0) j = -(j + 1);
                System.arraycopy(a, j, a, j + 1, i - j);
                a[j] = current;
            }
        }
    } 
    
}
