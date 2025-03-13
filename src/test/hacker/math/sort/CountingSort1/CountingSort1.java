package test.hacker.math.sort.CountingSort1;
import java.util.Arrays;
import java.util.List;

public class CountingSort1 {
    public static void main(String[] args) {
        Integer[] arr = {10, 7, 8, 9, 1, 5};
    
        List<Integer> res = Result.countingSort(Arrays.asList(arr));
    
        System.out.println("Sorted অ্যারে: " + res);
        
    }
}
