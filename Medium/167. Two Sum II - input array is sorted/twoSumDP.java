
/**
 * Submitted: 10/27/2022
 * 
 * 
 */

public class twoSumDP {

    public static void main(String[] args) {
        
    }

    /**
     * Time: O(n) - looping through numbers array
     * Space: O(1) - no extra space created here
     */
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            if(numbers[left] + numbers[right] == target) 
                return new int[] {left + 1, right + 1};
            else if(numbers[left] + numbers[right] > target) 
                right--;
            else 
                left++;
        }

        return new int[] {};
    }
}