package test.hacker.math.sort.Invariant_Loop;

import java.util.List;
import java.util.stream.Stream;

public class Result {

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int s = 0;
        Integer[] res = new Integer[n];
        for (int j = 0; j < n; j++) {
            res[j] = arr.get(j);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                s = s + isGreater(res, res[j-1], res[j], j);
                
            }
            Stream.of(res).forEach(f -> System.out.print(f + " "));
            System.out.println(s);
        }

        // Stream.of(res).forEach(f -> System.out.print(f + " "));
       System.out.print(s);
    }

    private static Integer isGreater(Integer[] arr,Integer mValue, Integer checkValue, int pos) {
        int s = 0;
        int i = 0;
        // for (int i = 0; i < pos; i++) {
            // while (i<pos) {
            if (mValue > checkValue) {
                s++;
                int rp = arr[pos-1];
                arr[pos-1] = checkValue;
                arr[pos] = rp;
                checkValue = rp;
            // }else{
            //     return s;
            // }
            i++;
        }
        System.out.println("sort= "+s);
        return s;
    }
    
}
