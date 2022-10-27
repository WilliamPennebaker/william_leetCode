
/**
 * Submitted: 10/27/2022
 * 
 * You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 * 
 * Constaints:
 *      n == height.length
 *      2 <= n <= 10^5
 *      0 <= height[i] <= 10^4
 */

public class maxAreaDP {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: height = [1,8,6,2,5,4,8,3,7]
         * Output: 49
         * Explanation: In this case, the max area of water the container can contain is 49.
         * (1, 0) & (1, 8) with (8, 0) & (8, 7)
         */

        /**
         * Example 2:
         * Input: [1,1]
         * Output: 1
         * Leetcode giving amazing examples...
         */
    }

    /**
     * DP two pointers
     */
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;

        while(left < right) {
            /**
             * Math equation
             * area = height * width
             * Height we already know from the array so we just need the min
             * Width will be our pointers
             * Then the area is height * width
             * Once we have that formula we just have to find the max with Math.max(max, area)
             */
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            // Basic DP left and right comparision
            if(height[left] > height[right]) 
                right--;
            else if(height[left] < height[right])
                left++;
            else {
                right--;
                left++;
            }
        }

        return max;
    }
}
