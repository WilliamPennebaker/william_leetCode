
/**
 * Submitted 09/08/2022
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Time: O(n) - looping through array
 * Space: O(1)
 * 
 * Problem wants O(log n)
 */

public class searchInputPosition {
    
    public static void main(String[] args) {
        /**
         * Example 1
         * input: nums = [1,3,5,6], target = 5
         * output: 2
         */
        int nums[] = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
        
        /**
         * Example 2
         * input: nums = [1,3,5,6], target = 2
         * output: 2
         */
        target = 2;
        System.out.println(searchInsert(nums, target));

        /**
         * Example 3
         * input: nums = [1,3,5,6], target = 7
         * output: 4
         */
        target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int nums[], int target) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            // nums[i] < target then add 1 to output and continue
            if (nums[i] < target) {
                output = i + 1;
            // nums[i] >= target then return the index
            } else {
                return i;
            }
        }
        // return the the last index + 1 so we know the number would be added at the end of array
        return output;
    }
}
