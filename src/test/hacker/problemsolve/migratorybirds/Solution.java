package test.hacker.problemsolve.migratorybirds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map= new HashMap<>();
        for (Integer a: arr) {
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else {
                map.put(a, 1);
            }
        }
        int mach =0, key=0;
        for (Integer b: map.keySet()) {
            if(mach<map.get(b)){
                mach=map.get(b);
                key=b;
            }
        }
        return key;
    }
}
