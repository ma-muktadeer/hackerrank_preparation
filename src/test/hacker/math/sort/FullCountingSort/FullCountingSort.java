package test.hacker.math.sort.FullCountingSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FullCountingSort {

    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();
        arr.add(Arrays.asList("0", "a"));
        arr.add(Arrays.asList("1", "b"));
        arr.add(Arrays.asList("0", "c"));
        arr.add(Arrays.asList("1", "d"));
        arr.add(Arrays.asList("3", "e"));

        Result.countSort(arr);
    }
}