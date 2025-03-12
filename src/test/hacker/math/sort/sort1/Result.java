package test.hacker.math.sort.sort1;

import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
    int l = arr.size()-1;
    int i = l;
    boolean bl = true;
    Integer checkValue = arr.get(l);
    Integer[] res = new Integer[n];
    for (int j = 0; j < arr.size(); j++) {
        res[j]= arr.get(j);
    }
    
    while(bl && i>=0){
        i --;
        if(i<0){
            res[i+1]= checkValue;
        }else{
            bl = isGreater(arr.get(i), checkValue );
            if(bl){
                res[i+1] = arr.get(i);
            }else{
                res[i+1]= checkValue;
            }
        }
        Stream.of(res).forEach(f->System.out.print(f+" "));
        System.out.println();
    }
    Stream.of(res).forEach(f->System.out.print(f+" "));
    }
    
    static boolean isGreater(Integer value, Integer checkValue){
        return value > checkValue;
    }

}
