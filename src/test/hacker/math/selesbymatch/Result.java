package test.hacker.math.selesbymatch;

import java.util.Collections;
import java.util.List;

public class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int res = 0;
        Collections.sort(ar);
        for (int i = 0; i < ar.size() - 1; i++) {
            if (ar.get(i) == ar.get(i + 1)) {
                res = res + 1;
                i = i + 1;
            }

        }
        return res;
    }
}
