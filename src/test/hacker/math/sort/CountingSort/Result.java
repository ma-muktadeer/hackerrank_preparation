package test.hacker.math.sort.CountingSort;

import java.util.Arrays;
import java.util.List;

public class Result {
    public static List<Integer> sortList(int n, int[] arr){

        Integer[] ar = new Integer[n];
        Arrays.fill(ar, 0);

        for (int i = 0; i < arr.length; i++) {
            ar[arr[i]-1]=ar[arr[i]-1] + 1;
        }

        return List.of(ar);
    }
}
