
/**
 * Submitted: 9/22/2022
 * 
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 * A subarray is a contiguous subsequence of the array.
 * 
 * Constraints:
 *      1 <= nums.length <= 2*10^4
 *      -10 <= nums.length <= 10
 *      The product of any prefix or suffix of nums is guarenteed to fit in a 32-bit integer.
 */

public class maximumProduct {

    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: nums = [2,3,-2,4]
         * Output: 6
         * Explanation: [2,3] has the largest product 6
         */

        /**
         * Example 2:
         * Input: nums = [-2,0,-1]
         * Output: 0
         * Explanation: The result cannot be 2, because [-2,-1] is not a subarray
         */
    }

    public static int maxProduct(int[] nums) {
        int min = nums[0], max = nums[0];
        int result = max;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int temp = Math.max(current, Math.max(max*current, min*current));
            min = Math.min(current, Math.min(min*current, max*current));
            max = temp;

            result = Math.max(result, max);
        }

        return result;
    }
    
}
