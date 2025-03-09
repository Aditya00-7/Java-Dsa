package DP;

public class StringConversion {
        public static int minOperations(String str1, String str2) {
            int m = str1.length();
            int n = str2.length();

            // DP table to store results of subproblems
            int[][] dp = new int[m + 1][n + 1];

            // Fill the DP table
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    // If first string is empty, insert all characters of second string
                    if (i == 0) {
                        dp[i][j] = j;
                    }
                    // If second string is empty, remove all characters of first string
                    else if (j == 0) {
                        dp[i][j] = i;
                    }
                    // If last characters are the same, ignore them and recur for remaining substring
                    else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                    // If last characters are different, consider all possibilities and take minimum
                    else {
                        dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],  // Replace
                                Math.min(dp[i - 1][j],    // Remove
                                        dp[i][j - 1]));  // Insert
                    }
                }
            }
            return dp[m][n];  // Final result
        }

        public static void main(String[] args) {
            String str1 = "kitten";
            String str2 = "sitting";

            System.out.println("Minimum operations required: " + minOperations(str1, str2));
        }
}

