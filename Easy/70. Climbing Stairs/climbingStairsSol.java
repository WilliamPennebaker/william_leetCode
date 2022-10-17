
/**
 * Submited: 09/30/2022
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Constraints:
 *      1 <= n <= 45
 * 
 * Time: O(n) - for loop
 * Space: O(1) - no extra data structure to take up space
 */

public class climbingStairsSol {
    
    public static void main(String[] args) {
        System.out.println(climbingStairs(4));
    }

    public static int climbingStairs(int n) {
        // Base cases
        if(n <= 2) return n;

        int all = 0;
        int twoSteps = 1;
        int oneSteps = 2;

        for (int i = 2; i < n; i++) {
            all = oneSteps + twoSteps;
            twoSteps = oneSteps;
            oneSteps = all;
        }

        return all;
    }
}
