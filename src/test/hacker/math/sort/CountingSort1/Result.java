package test.hacker.math.sort.CountingSort1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        Integer[] ar = new Integer[100];
        Arrays.fill(ar, 0);

        for (int i = 1; i <= arr.size(); i++) {
            ar[arr.get(i-1)]=ar[arr.get(i-1)] + 1;
        }
        List<Integer> res = new ArrayList<>();
        for(int j=0; j<ar.length; j++){
            int n = ar[j];
            if(n>0){
                while(n-->0){
                    res.add(j);
                }
            }
        }

        return res;
    }
}
