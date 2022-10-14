
/**
 * Submitted 10/14/2022
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Time: O(logn) - looping through array
 * Space: O(1)
 */


public class searchInputPosOptimal {
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
        // base case if nums is empty or null
        if(nums == null || nums.length == 0) return 0;
        // two pointers beginning and end of array
        int low = 0, high = nums.length - 1;
        // loop until low is greater than high
        while(low < high) {
            // find our mid point which is half of high or (low + (high - low)/2)
            int mid = low + (high - low)/2;
            // if our mid number equals the target then return target
            if(nums[mid] == target) return mid;
            // if mid number is greater than the target then the number must be on the left side
            else if(nums[mid] > target) high = mid;
            // if number is less than target than the number must be on the right side
            else low = mid + 1;
        }
        // 1 element will be left at the end. If the number is less than target then just return the index of the number + 1
        return nums[low] < target ? low + 1: low;
    }
}
