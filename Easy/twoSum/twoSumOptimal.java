package Easy.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Submitted 09/15/2022
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Constraints:
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists
 * 
 * 
 * Time: O(n) looping through array once
 * Space: O(1) hashmap
 */

public class twoSumOptimal {
    public static void main(String[] args) {
        /**
         * Example 1
         * nums = [2,7,11,15], target = 9
         * output = [0,1]
         * nums[0] + nums[1] = 2 + 7 = 9 so return nums[0, 1]
         */
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int sol[] = twoSum(nums, target);
        for (int i : sol) {
            System.out.print(i + " ");
        }
        System.out.println();
        /**
         * Example 2
         * nums = [3,2,4], target = 6
         * output = [1,2]
         */
        nums = new int[] {3,2,4};
        target = 6;
        sol = twoSum(nums, target);
        for (int i : sol) {
            System.out.print(i + " ");
        }
        System.out.println();
        /**
         * Example 3
         * nums = [3,3], target = 6
         * output = [0,1]
         */
        nums = new int[] {3,3};
        target = 6;
        sol = twoSum(nums, target);
        for (int i : sol) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        // initializing hashmap
        Map <Integer, Integer> prevElem = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // find the difference between target and num so we can find it in our hashmap

            if (prevElem.containsKey(diff)) { // solution found
                return new int[] {prevElem.get(diff), i};
            } else { // if the difference wasnt in the hashmap then add it for later
                prevElem.put(nums[i], i);
            }
        }

        // return 0s if none of the numbers add up to target
        return new int[] {0, 0};
    }
}
