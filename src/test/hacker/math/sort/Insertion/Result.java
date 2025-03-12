package test.hacker.math.sort.Insertion;

import java.util.List;
import java.util.stream.Stream;

public class Result {
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        Integer[] res = new Integer[n];
        for (int j = 0; j < n; j++) {
            res[j] = arr.get(j);
        }
        for (int i = 0; i < n - 1; i++) {
            isGreater(res, res[i+1], i+1);
            Stream.of(res).forEach(f -> System.out.print(f + " "));
            System.out.println();
        }

        // Stream.of(res).forEach(f -> System.out.print(f + " "));
    }

    private static Integer[] isGreater(Integer[] arr, Integer checkValue, int pos) {
        for (int i = 0; i < pos; i++) {
            
            if (arr[i] > checkValue && pos != i) {
                int rp = arr[i];
                arr[i] = checkValue;
                arr[pos] = rp;
                checkValue = rp;
            }
        }
        return arr;
    }
}
