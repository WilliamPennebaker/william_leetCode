import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Submitted: 10/24/2022
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * Constraints:
 *      3 <= nums.length <= 3000
 *      -10^5 <= nums[i] <= 10^5
 */

public class threeSumIter {
    
    public static void main(String[] args) {
        
    }

    /**
     * Time: O(1)
     * Space: O(nlog(n)) + O(n^2)
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        /**
         * If there are less than 3 elements then there is no valid subset
         * If we have min val greater than 0, its not possible to produce subset where count is zero
         * If we have max val less than 0, its not possible to produce subset where count is zero
         */
        if(nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) return list;

        for (int i = 0; i < nums.length-2; i++) {
            // Current i is same as previous then it will create a duplicate
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[j] + nums[k] + nums[i];
                if(sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    /**
                     * if we have duplicate elements then we need to get rid of them so we will move j and k 
                     * pointers to a position where there arent any duplicate elements
                     */ 
                    while(j < k && nums[j] == nums[j+1]) j++;
                    while(j < k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                } 
                else if(sum > 0) k--;
                else j++;
            }
        }
        return list;
    }
}
