package test.hacker.math.sort.SortAdvanced;

import java.util.List;

public class Result {
    public static int insertionSort(List<Integer> arr) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            count = count + sorting(arr, arr.get(i), i);
        }
        return count;
    }

    private static int sorting(List<Integer> arr, int value, int pos) {
        int res = 0;
       
        for (int i = 1; i < arr.size(); i++) {
            System.out.println("value= " +value);
            if (arr.get(i) < value && i < pos) {
                int v = arr.get(i);
                arr.set(i, value);
                value = v;
                arr.set(pos, value);
                res++;
            }else if(i == pos){
                System.out.println(arr);
                return res;
            }
        }
        return res;
    }

}
