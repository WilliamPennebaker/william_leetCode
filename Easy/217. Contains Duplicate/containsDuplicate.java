import java.util.HashSet;

/**
 * Submitted: 09/12/2022
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * Constraints:
 *      1 <= nums.length <= 105
 *      -109 <= nums[i] <= 109
 * 
 * Time: O(n)
 * Space: O(n)
 */

public class containsDuplicate {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: nums = [1,2,3,1]
         * Output: true
         */
        int[] nums = {1,2,3,1};
        System.out.println(containsDupe(nums));

        /**
         * Example 2:
         * Input: nums = [1,2,3,4]
         * Output: false
         */
        nums = new int[] {1,2,3,4};
        System.out.println(containsDupe(nums));

        /**
         * Example 3:
         * Input: nums = [1,1,1,3,3,4,3,2,4,2]
         * Output: true
         */
        nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDupe(nums));
    }

    public static boolean containsDupe(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }

        return false;
    }
}
