package test.hacker.math.summingnth;

public class SummingSeries {
    static int mod = 1000000007;
    public static int summingSeries(long n) {
    // Write your code here
     
         return (int)(((n % mod) * (n % mod)) % mod);
    }
}
