package test.hacker.problemsolve.billdivision;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int k= sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int b= sc.nextInt();;
        sc.close();
        Solution.bonAppetit(list,k,b);
    }
}
