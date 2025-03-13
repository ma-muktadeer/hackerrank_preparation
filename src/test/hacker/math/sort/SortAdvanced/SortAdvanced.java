package test.hacker.math.sort.SortAdvanced;

import java.util.Arrays;

public class SortAdvanced {
    
    public static void main(String[] args) {

        int res = Result.insertionSort(Arrays.asList(5, 4, 3, 2, 1));

        System.out.println("Median= " + res);
    }
}
