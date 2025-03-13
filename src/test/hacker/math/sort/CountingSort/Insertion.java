package test.hacker.math.sort.CountingSort;

import java.util.Arrays;

public class Insertion {
    
    public static void main(String[] args) {
        // Result.insertionSort1(4, List.of(4, 4, 3, 4));

         int[] arr = {10, 7, 8, 9, 1, 10, 1, 5};
        System.out.println("অরিজিনাল অ্যারে: " + Arrays.toString(arr));

         Result.sortList(10, arr);

        System.out.println("Sorted অ্যারে: " + Result.sortList(10, arr));
    }
}
