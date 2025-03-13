package test.hacker.math.sort.ClosestnNmbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here

        // 5,4,3,2
        List<List<Integer>> list = new ArrayList<>(arr.size() - 1);
        for (int i = 0; i < arr.size() - 1; i++) {
            list.add(new ArrayList<>());
        }
        arr = arr.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < arr.size() - 1; i++) {
            list.get(i).add(arr.get(i));
            list.get(i).add(arr.get(i + 1));
        }

        List<Integer> ind = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            ind.add(list.get(i).get(1) - list.get(i).get(0));
        }

        int smaller = ind.stream().min(Comparator.naturalOrder()).orElse(0);

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < ind.size(); i++) {
            if (ind.get(i) == smaller) {
                list.get(i).forEach(f -> res.add(f));
            }
        }
        System.out.println(res);
        return res;
    }
}
