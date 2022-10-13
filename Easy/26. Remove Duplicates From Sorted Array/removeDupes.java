
/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same.
 * 
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Time: O(n) - since we have to loop through array
 * Space: O(1)
 */

public class removeDupes {
    public static void main(String[] args) {
        /**
         * Example 1
         * input: nums = [1, 1, 2]
         * output: k = 2, nums = [1,2,_]
         * Explanation: Function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
         * It does not matter what you leave beyond the returned k.
         */
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);

        /**
         * Example 2
         * input: nums = [0,0,1,1,1,2,2,3,3,4]
         * output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
         * Explanation: Function should return k = 5, with the first five elements of nums being 0,1,2,3,4 respectively.
         * It does not matter what you leave beyond the returned k.
         */
        nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;                // if nums.length > 0 then 1 else 0
        for (int n : nums)                              // Loop through the array
            if(n > nums[i-1])                           // Check if the previous index is less than our current one
                nums[i++] = nums[i];                    // Update the current position to be the current number being tested and then increment i


        // Printing purposes
        for (int a : nums) 
            System.out.println(a);
        System.out.println("k = " + i);        

        // Returning k
        return i;
    }
}
