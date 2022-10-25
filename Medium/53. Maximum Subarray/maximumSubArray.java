
/**
 * Submitted: 9/28/2022
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least on number) which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 * 
 * Constraints:
 *      1 <= nums.length <= 10^5
 *      -10^4 <= nums[i] <= 10^4
 */

public class maximumSubArray {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: [-2,1,-3,4,-1,2,1,-5,4]
         * Output: 6
         * Explanation: [4,-1,2,1] has the largest sum = 6
         */

        /**
         * Example 2:
         * Input: [1]
         * Output: 1
         */

        /**
         * Example 3:
         * Input: nums = [5,4,-1,7,8]
         * Output: 23
         */
    }

    /**
     * Time: O(n)
     * Space: O(1)
     */
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(currentSum < 0) currentSum = 0;

            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);
        }
        
        return maxSum;
    }

}
