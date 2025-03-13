package test.hacker.math.sort.SortAdvanced;

import java.util.List;

public class Result {
    public static int insertionSort(List<Integer> arr) {
    // Write your code here
    int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            count = count + sorting(arr, arr.get(i));
        }
        return count;
    }

    private int sorting(List<Integer> arr, int value){
        
    }
    
}
