package test.hacker.problemsolve.migratorybirds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println(Solution.migratoryBirds(list));
    }
}
