package test.hacker.math.findthefedian;

import java.util.List;
import java.util.stream.Collectors;

public class Result {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        arr = arr.stream().sorted().collect(Collectors.toList());

        return arr.get(arr.size() / 2);
    }
}
