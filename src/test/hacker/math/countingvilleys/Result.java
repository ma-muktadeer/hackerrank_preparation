package test.hacker.math.countingvilleys;

public class Result {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int c = 0;
        char ch = 'U';
        int r = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == ch) {
                c++;
                if (c == 0) {
                    r++;
                }
            } else {
                c--;
            }
        }
        // System.out.println(c);
        // c = steps / 2 - c;

        return r;

        
    // for (char c : path.toCharArray())
    // {
    //     if (c == 'U') {
    //         level++;
    //         if (level == 0)
    //         {
    //             valleys++;
    //         }
    //     }
    //     else {
    //         level--;
    //     }
    // }
    // return valleys;
    }
}
