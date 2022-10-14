
/**
 * Submitted: 10/14/2022
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Constraints:
 *      1 <= digits.length <= 100
 *      0 <= digits[i] <= 9
 *      digits does not contain any leading 0's.
 */

public class plusOneLessMemIGuess {
    public static void main(String[] args) {
        /**
         * Example 1
         * Input: digits = [1,2,3]
         * Output: [1,2,4]
         * Explanation: The array represents the integer 123.
         * Incrementing by one gives 123 + 1 = 124.
         * Thus, the result should be [1,2,4].
         */
        int digits[] = {1,2,3};
        System.out.println(plusOneMethod(digits));

        /**
         * Example 2
         * Input: digits = [4,3,2,1]
         * Output: [4,3,2,2]
         * Explanation: The array represents the integer 4321.
         * Incrementing by one gives 4321 + 1 = 4322.
         * Thus, the result should be [4,3,2,2].
         */
        digits = new int[] {4,3,2,1};
        System.out.println(plusOneMethod(digits));

        /**
         * Example 3
         * Input: digits = [9]
         * Output: [1,0]
         * Explanation: The array represents the integer 9.
         * Incrementing by one gives 9 + 1 = 10.
         * Thus, the result should be [1,0].
         */
        digits = new int[] {9};
        System.out.println(plusOneMethod(digits));
    }

    public static int[] plusOneMethod(int[] digits) {
        // base case if digits is null
        if (digits == null) throw new IllegalArgumentException("Input array is null");
        // base case if digits len is 0
        if (digits.length == 0) return new int[] { 1 };
        // Reverse loop along the digits
        for (int i = digits.length-1; i >= 0; --i) {
            // Set 9 to zero
            if(digits[i] == 9) digits[i] = 0;
            // Carry the one or just increment the number at index and return array
            else {
                digits[i]++;
                return digits;
            }
        }
        // If every digit is 9 then we need make a new array with length of digit + 1 
        digits = new int[digits.length + 1];
        // and set first index to 1
        digits[0] = 1;
        // return the array
        return digits;
    }
}
