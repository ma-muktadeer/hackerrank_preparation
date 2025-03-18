package test.hacker.math.LilysHomework;

import java.util.List;

public class Result {
    public static long lilysHomework(List<Integer> arr) {
        
        long count = 0;
        for (int i = 0; i < arr.size() - 2; i++) {
            boolean swp = isSwapValue(arr.subList(0, i + 2), arr.subList(i + 2, arr.size()));
            if (swp) {
                count += 1;
            }
        }

        return count;
    }

    private static boolean isSwapValue(List<Integer> subList, List<Integer> subList2) {
        int m1 = subList.stream().max(Integer::compareTo).get();
        int m2 = subList2.stream().min(Integer::compareTo).get();

        return m1 > m2;
    }
}
