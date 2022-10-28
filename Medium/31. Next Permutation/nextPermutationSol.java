
/**
 * Submitted: 10/28/2022
 * 
 * This problem is basically, if you've seen it before the interviewer will know and can probably solve in 30 or so minutes, if not then good luck...
 * 
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 *      For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
 * 
 * The next permutation of an array of integers is the next lexicographically greater permutation of its integer. 
 * More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, 
 * then the next permutation of that array is the permutation that follows it in the sorted container. 
 * If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
 * 
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
 * Given an array of integers nums, find the next permutation of nums.
 * The replacement must be in place and use only constant extra memory.
 * 
 * Constraints:
 *      1 <= nums.length <= 100
 *      0 <= nums[i] <= 100
 */

public class nextPermutationSol {

    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: nums = [1,2,3]
         * Output: [1,3,2]
         */

        /**
         * Example 2:
         * Input: nums = [3,2,1]
         * Output: [1,2,3]
         */

        /**
         * Example 3:
         * Input: nums = [1,1,5]
         * Output: [1,5,1]
         */
    }
    
    /**
     * There is a brute force method where you can find out every possible permutation from the elements in the array.
     * This will take O(n!) time which will take very long to run and O(n) space to store all the permutations.
     * 
     * Using a single pass approach, we have to know that any given sequence is in descending order then no next larger permutation is possible. ie. [9,5,4,3,1]
     * Need to find nums[i] and nums[i-1] fromt the right which statisfies nums[i] > nums[i-1] then we can arrage the numbers to the right of nums[i-1].
     * So we need the next largest number from nums[i-1] to the right, nums[j]. We can swap them and should have correct number at index i-1 but still need to continue.
     * Once nums[i-1] and nums[j] have swapped we will have to reverse the order of everything after the index i-1
     * 
     * Time: O(n) - worst case here is that only two scans of the whole array are needed.
     * Space: O(1) - no extra space here since in place replacements are done. 
     */
    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) i--;   // Find first number that breaks descending order
        if (i >= 0) {                                   // If not entirely descending
            int j = nums.length - 1;                    // Start from the end
            while (nums[j] <= nums[i]) j--;             // Find the right most first larger j
            swap(nums, i, j);                           // Swap i and j
        }
        reverse(nums, i + 1);                           // Reverse the order for the next permutation
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
