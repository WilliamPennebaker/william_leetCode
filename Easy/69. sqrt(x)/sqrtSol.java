
/**
 * Submitted: 09/09/2022
 * 
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
 * The returned integer should be non-negative as well.
 * 
 * You must not use any built-in exponent function or operator.
 *      For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * 
 * Constraints:
 *      0 <= x <= 231 - 1
 * 
 * 
 */

public class sqrtSol {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: x = 4
         * Output: 2
         * Explanation: The square root of 4 is 2, so we return 2.
         */

        /**
         * Example 2:
         * Input: x = 8
         * Output: 2
         * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
         */
    }
    
    /**
     * This is a binary search implementation
     */
    public static int sqrt(int x) {
        int left = 1;
        int right = x; // Half of the numbers will be greater than x

        if(x < 2) return x; // Negative numbers, 0 (0*0), and 1 (1*1)

        while (left < right) {
            // Math.floor with this will give a double so parse to int
            int mid = (left + right) / 2; // 1+9 = 10/2 = 5

            int div = x/mid;
            if(div == mid) return mid; // if our mid is the answer then return it
            else if(div < mid) right = mid; // if div is < mid then cut the right side out since those numbers are bigger
            else left = mid + 1; // if div > mid then cut left side out since those numbers are smaller
        }

        return left - 1;
    }

    /**
    *   for 8, we have 1 2 3 4 | 5 6 7 8
    *   4 is the mid point and since everything to the right * 2 will be greater than 8 so we can remove it
    *   on the left side, divide by 2 and check the left two. 2 * 2 will give 4 so not 8, remove that half
    *   check 3, 3*3 is 9 so not working. So we take the -1 of that and we get 2.
    *
    *   for 9, we have 1 2 3 4 5 6 7 8 9, mid point is 5
    *   Left 1
    *   Right 9
    *   since 5*5 is 25 and higher than 9, remove the right half
    *   Right 5, midpoint is 3
    *   3*3 is 9
    */

}
