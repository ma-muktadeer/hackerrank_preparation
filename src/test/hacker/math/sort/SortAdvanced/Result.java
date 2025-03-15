package test.hacker.math.sort.SortAdvanced;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static long insertionSort(List<Long> arr) {
        // Write your code here
        long count = 0;
        List<Long> ar = new ArrayList<>();
        // System.out.println(arr.size());
        ar.add(arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            ar.add(arr.get(i));
            count = count + sorting(arr, arr.get(i), i);
        }
        return count;
    }

    private static long sorting(List<Long> arr, Long value, int pos) {
        long res = 0;

        for (int i = 0; i < arr.size(); i++) {
            // System.out.println("value= " +value);
            if (arr.get(i) > value && i < pos) {
                Long v = arr.get(i);
                arr.set(i, value);
                value = v;
                arr.set(pos, value);
                res++;
            }
        }
        return res;
    }

}
