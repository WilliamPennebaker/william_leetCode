import java.util.Arrays;

/**
 * Submitted: 11/1/2022
 * 
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, then return 1.
 * You may assume that you have an infinite number of each kind of coin.
 * 
 * Constraints:
 *      1 <= coins.length <= 12
 *      1 <= coins[i] <= 2^31 - 1
 *      0 <= amount <= 10^4
 * 
 * We could do DFS with memorization or BFS since they don't visit invalid states
 * However, DP would be the fastest here.
 * Brute force would be to just loop through the coins and call the coinChange(coins, amount-coins[i]) method in the loop
 */
public class coinChangeSol {

    public static void main(String[] args) {
        
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;

        for(int i = 1; i <= amount; i++) {
            for(int coin : coins) {
                if(i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        if(dp[amount] > amount) dp[amount] = -1;

        return dp[amount];
    }
    
}
