import java.util.Map;

/**
 * Submitted: 10/27/2022
 * 
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
 * find two numbers such that they add up to a specific target number. 
 * Let these two numbers be numbers[index1] and numbers[index2] 
 * where 1 <= index1 < index2 <= numbers.length.
 * 
 * Return the indices of the two numbers, index1 and index2, 
 * added by one as an integer array [index1, index2] of length 2.
 * 
 * The tests are generated such that there is exactly one solution. 
 * You may not use the same element twice.
 * 
 * Your solution must use only constant extra space.
 * 
 * Constraints:
 *      2 <= numbers.length <= 3 *10^4
 *      -1000 <= numbers[i] <= 1000
 *      numbers is sorted in non-decreasing order.
 *      -1000 <= target <= 1000
 *      The tests are generated such that there is exactly one solution
 */

public class twoSumHashMap {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: numbers = [2,7,11,15], target = 9
         * Output: [1,2]
         * Explanation: The sum of 2 and 7 is 9. Therefore, index[1] = 1, index[2] = 2.
         * We return [1,2].
         */

        /**
         * Example 2:
         * Input: numbers = [2,3,4] , target = 6
         * Output: [1,3]
         * Explanation: The sum of 2 and 4 is 6. Therefore index[1] = 1, index[2] = 3.
         * We return [1,3].
         */

        /**
         * Example 3:
         * Input: numbers = [-1,0], target = -1
         * Output: [1,2]
         * Explanation: The sum of -1 and 0 is -1. Therefore index[1] = 1, index[2] = 2.
         * We return [1,2]
         */
    }

    /**
     * Attempt at using a hashmap for two sum II
     * Time: O(n) - Best time for hashmap is O(1) but we are looping through numbers so O(n)
     * Space: O(n) - Extra space for Hashmap
     */
    public static int[] twoSum(int[] numbers, int target) {
        // Initializing hashmap
        Map<Integer, Integer> prevElem = new HashMap();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i]; // Find the difference between target and number

            if(prevElem.containsKey(diff)) { // Solution found
                return new int[] {prevElem.get(diff) + 1, i + 1};
            } else { // If the difference wasnt in the hashmap then add it for later
                prevElem.put(numbers[i], i);
            }
        }

        // Return empty array if none of the numbers add up to target
        return new int[] {};
        
    }
}
