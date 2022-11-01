
/**
 * Submitted: 11/1/2022
 * 
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1,-1]/
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Constraints:
 *      0 <= nums.length <= 10^5
 *      -10^9 <= nums[i] <= 10^9
 *      nums is a non-decreasing array.
 *      -10^9 <= target <= 10^9
 * 
 * Looking for an O(log n) solution so we will need to write a binary search
 * This is somewhat a combination of twoSum and find minimum in sorted array
 * We will have to find two numbers in a sorted array that are the target
 * Fist method will find the left most occurance - which is why the end = mid - 1; is there
 * Second method will find the right most occurance - which is why the start = mid + 1; is there
 */

public class searchRangeSol {

    public static void main(String[] args) {
        
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findSecond(nums, target);
        return result;
    }

    public int findFirst(int[] nums, int target) {
        int index = -1, start = 0, end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] > target) end = mid - 1;
            else if(nums[mid] < target) start = mid + 1;
            else { // nums[mid] == target
                index = mid; 
                end = mid - 1; // mid could be the first occurance, this is just a check to see if something below mid is the target
            }
        }

        return index;
    }

    public int findSecond(int[] nums, int target) {
        int index = -1, start = 0, end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] > target) end = mid - 1;
            else if(nums[mid] < target) start = mid + 1;
            else {
                index = mid;
                start = mid + 1;
            }
        }

        return index;
    }

}