package test.hacker.problemsolve.billdivision;

import java.util.List;

public class Solution {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int an= bill.get(k);
        int sum=0;
        for(int i=0; i<bill.size(); i++){
            if(i!=k){
                sum= sum+bill.get(i);
            }
        }
        int s = (sum/2);
        if(s<b){
            System.out.println(b-s);
        }else if (s==b) {
            System.out.println("Bon Appetit");
        }
    }

}
