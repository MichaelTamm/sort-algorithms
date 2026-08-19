package ikg;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var n = 10000;
        var arrayToSort = new int[n];
        var rng = new Random();
        for (int i = 0; i < n; ++i) {
            arrayToSort[i] = rng.nextInt(1_000_000);
        }

        var sortedArray = arrayToSort.clone();
        Arrays.sort(sortedArray);

        Sorter[] sorters = {
            new HerrTammInsertionSort2(),
            new HerrTammInsertionSort(),
            new Dennis(),
        };
        outerLoop:
        for (var sorter: sorters) {
            var a = arrayToSort.clone();
            var t0 = System.nanoTime();
            sorter.sort(a);
            var dt = System.nanoTime() - t0;
            for (int i = 0; i < n; ++i) {
                if (a[i] != sortedArray[i]) {
                    System.out.println(sorter.getClass().getSimpleName() + " did not sort the int array correctly");
                    continue outerLoop;
                }
            }
            System.out.println(sorter.getClass().getSimpleName() + " sorted " + n + " integers in " + dt / 1000 + "µs");
        }
    }
}
