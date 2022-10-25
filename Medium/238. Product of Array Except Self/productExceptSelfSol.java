
/**
 * Submitted: 09/22/2022
 * 
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * Constraints:
 *      2 <= nums.length <= 105
 *      -30 <= nums[i] <= 30
 *      The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

public class productExceptSelfSol {

    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: nums = [1,2,3,4]
         * Output: [24,12,8,6]
         */
        int[] nums = new int[] {1,2,3,4};
        productExceptSelf(nums);

        /**
         * Example 2:
         * Input: nums = [-1,1,0,-3,3]
         * Output: [0,0,9,0,0]
         */
        nums = new int[] {-1,1,0,-3,3};
        productExceptSelf(nums);
    }   

    /**
     * Time: O(n)
     * Space: O(1)
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int pre = 1, post = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = pre;
            pre *= nums[i];
        }
        
        for (int i = nums.length-1; i >= 0; i--) {
            answer[i] *= post;
            post *= nums[i]; 
        }
        
        return answer;
    }
}

/**
 * Idea:
 * Make a new array
 * Add the first element as 1
 * for loop through nums
 * put pre into answer array
 * Then multiply pre by nums[i]
 * ^ first for loop
 * nums = 1,2,3,4
 * answer[0] = 1, pre = 1, nums[0] = 1   1*1 = 1
 * answer[1] = 1, pre = 1, nums[1] = 2   2*1 = 2
 * answer[2] = 2, pre = 2, nums[2] = 3   3*2 = 6
 * answer[3] = 6
 * answer = 1,1,2,6
 * loop through nums again backwards
 * add answer and multiply it by post
 * multiply post by nums[i]
 * nums = 1,2,3,4
 * answer[3] = 6, post = 1 nums[3] = 4      4*1 = 4 
 * answer[2] = 8, post = 4 nums[2] = 3      4*3 = 12
 * answer[1] = 12, post = 12 nums[1] = 2    12*2 = 24
 * answer[0] = 24
 * answer = 24,12,8,6
 */