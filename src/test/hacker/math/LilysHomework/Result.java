package test.hacker.math.LilysHomework;

import java.util.List;

public class Result {

    public static long lilysHomework(List<Integer> arr) {
        Integer[] ar = arr.stream().toArray(Integer[]::new);
        long count = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            boolean isSwap = swapValue(ar, i);
            if(isSwap){
                count += 1;
            }
        }

        return count;
    }

    private static boolean swapValue(Integer[] ar, int i) {
        Integer checkValue = ar[i];
        boolean isSwap = false;
        for (int j = i + 1; j < ar.length; j++) {
            if(checkValue > ar[j]){
                ar[i] = ar[j];
                ar[j]=checkValue;
                isSwap = true;
            }else{
                continue;
            }
        }
        return isSwap;
    }

}
