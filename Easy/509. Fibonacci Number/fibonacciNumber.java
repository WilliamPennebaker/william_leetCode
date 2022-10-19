
/**
 * Submitted: 09/30/2022
 * 
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * 
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * 
 * Given n, calculate F(n).
 * 
 * Constraints:
 *      0 <= n <= 30
 * 
 * 
 */

public class fibonacciNumber {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: n = 2
         * Output: 1
         * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
         */
        int n = 2;
        System.out.println(fib(n));

        /**
         * Example 2:
         * Input: n = 3
         * Output: 2
         * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
         */
        n = 3;
        System.out.println(fib(n));

        /**
         * Example 3:
         * Input: n = 4
         * Output: 3
         * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
         */
        n = 4;
        System.out.println(fib(n));

    }

    public static int fib(int n) {
        if(n<=1) return n;

        int a = 0, b = 1;

        while(n-- > 1) {
            int sum = a+b;
            a = b;
            b = sum;
        }

        return b;
    }
}
