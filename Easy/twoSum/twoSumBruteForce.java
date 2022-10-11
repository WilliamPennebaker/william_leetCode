package Easy.twoSum;

/**
 * Submitted 08/19/2021
 * 
 * Brute force to just loop through the array and see if the two indexs added together equal the target number.
 * This is not as efficient as the optimal solution of storing in a hashmap
 * Time: O(n^2) since we have a nested for loop
 * Space: O(2) for the solution array
 */

public class twoSumBruteForce {
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
        int solution[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    if(i!=j) {
                        solution[0] = i;
                        solution[1] = j;
                        return solution;
                    }
                }
            }
        }

        return solution;
    }
}
