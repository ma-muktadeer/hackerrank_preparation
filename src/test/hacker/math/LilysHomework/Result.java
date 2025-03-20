package test.hacker.math.LilysHomework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    public static long lilysHomework(List<Integer> arr) {
        return Math.min(minSwap(arr, true), minSwap(arr, false));
    }

    private static long minSwap(List<Integer> arr, boolean ascending) {
        int n = arr.size();
        int[] original = arr.stream().mapToInt(Integer::intValue).toArray();
        int[] sorter = Arrays.copyOf(original, n);

        Arrays.sort(sorter);
        if (!ascending) {
            for (int i = 0; i < n / 2; i++) {
                int temp = sorter[i];
                sorter[i] = sorter[n - i - 1];
                sorter[n - i - 1] = temp;
            }
        }

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(original[i], i);
        }

        boolean[] visied = new boolean[n];
        long swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visied[i] && indexMap.get(sorter[i]) == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visied[j]) {
                visied[j] = true;
                j = indexMap.get(sorter[j]);
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += cycleSize - 1;
            }
        }
        return swaps;
    }
}
