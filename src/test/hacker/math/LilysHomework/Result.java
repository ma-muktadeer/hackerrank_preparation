package test.hacker.math.LilysHomework;

import java.util.List;
import java.util.stream.Stream;

public class Result {

    public static long lilysHomework(List<Integer> arr) {
        Integer[] ar = arr.stream().toArray(Integer[]::new);
        long count = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            boolean isSwap = swapValue(ar, i);
            if (isSwap) {
                count += 1;
            }
        }

        // System.out.println(Stream.of(ar).toList());

        return count;
    }

    private static boolean swapValue(Integer[] ar, int i) {
        Integer checkValue = ar[i];
        boolean isSwap = false;
        for (int j = i + 1; j < ar.length; j++) { // 7, 15, 12, 3
            if (checkValue > ar[j]) {
                if (i + 1 == j) {
                    Integer v = checkValue;
                    ar[i] = ar[j];
                    ar[j] = v;
                    checkValue = ar[i];
                } else {
                    for (int k = i + 1; k < j; k++) {
                        Integer v = checkValue;
                        ar[k] = ar[j];
                        ar[j] = v;
                        checkValue = ar[k];
                    }
                }
                isSwap = true;
            } else {
                continue;
            }
        }
        System.out.println(Stream.of(ar).toList());

        return isSwap;
    }

}
