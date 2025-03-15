package test.hacker.math.sort.SortAdvanced;

import java.util.Arrays;
import java.util.List;

public class SortAdvanced {
    
    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(2, 5, 1, 3, 4, 1);

        int res = Result.insertionSort(ar);

        System.out.println("Count= " + res);
    }
}
