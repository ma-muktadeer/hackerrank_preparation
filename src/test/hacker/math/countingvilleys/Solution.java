package test.hacker.math.countingvilleys;

public class Solution {
    public static void main(String[] args) {
        String path = "DDUUDDUDUUUD";
        int steps = 12;
        int result = Result.countingValleys(steps, path);
        System.out.println(result);
    }
}
