package test.hacker.math.sort.FullCountingSort;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static void countSort(List<List<String>> arr) {
        // Write your code here

        int cnt = arr.size();
        int hc = cnt / 2;

        List<List<String>> bkt = new ArrayList<>(cnt);

        for (int i = 0; i < cnt; i++) {
            bkt.add(new ArrayList<>());
        }

        for (int i = 0; i < cnt; i++) {
            int key = Integer.parseInt(arr.get(i).get(0));
            String vlu = arr.get(i).get(1);
            System.out.println(bkt);
            System.out.println("key= " + key + " value= " + vlu);
            if (i < hc) {
                vlu = "-";
            }
            bkt.get(key).add(vlu);
        }

        System.out.println(bkt);

        for (List<String> list : bkt) {
            if (!list.isEmpty()) {
                System.out.print(String.join(" ", list) + " ");
            }
        }
    }

}
