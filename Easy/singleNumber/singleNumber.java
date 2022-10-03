package Easy.singleNumber;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */
public class singleNumber {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 4};
        System.out.println(single_Number(nums));
    }

/*
Explanation:
bitwise XOR in java

0 ^ N = N
N ^ N = 0
So..... if N is the single number

N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N

= (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N

= 0 ^ 0 ^ ..........^ 0 ^ N

= N

Time: O(n)
Space: O(1)
*/
    public static int single_Number(int nums[]) {
        int result = 0;

        for (int i = 0; i < nums.length; i++)
            result ^= nums[i];
        
        return result;
    }
}
