package DP;

public class Coins {
    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];

        // Initialize - when sum is 0, there is 1 way (by taking no coins)
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }

        // Initialize - when no coins are used, there are 0 ways to make any positive sum
        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = 0;
        }

        // Fill the DP table
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) { // Valid choice
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int sum = 6;
        System.out.println(coinChange(coins, sum)); // Expected output: 5
    }
}

