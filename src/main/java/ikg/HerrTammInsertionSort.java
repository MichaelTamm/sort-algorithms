package ikg;

public class HerrTammInsertionSort implements Sorter {
   
    public void sort(int[] a) {
        var n = a.length;
        for (int i = 1; i < n; ++i) {
            int current = a[i];
            int j = i - 1;
            if (a[j] > current) {
                do {
                    a[j + 1] = a[j];
                    if (--j < 0) break;
                } while (a[j] > current);
                a[j + 1] = current;
            }
        }
    } 
    
}
