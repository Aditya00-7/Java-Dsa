package DP;

public class MCMTabulation {
        public static int mcm(int arr[]) {
            int n = arr.length;
            int dp[][] = new int[n][n];

            for (int i=0;i<n;i++){
                dp[i][i]=0;
            }

            // Filling dp table bottom-up
            for (int len = 2; len <=n-1; len++) { // len is the chain length
                for (int i = 1; i <=n - len; i++) {
                    int j = i + len - 1; //col
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k <=j-1; k++) {
                        int cost = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                        dp[i][j] = Math.min(dp[i][j], cost);
                    }
                }
            }
           print(dp);
            return dp[1][n - 1]; // Minimum cost to multiply matrices from 1 to n-1
        }
        public static void print(int dp[][]){
            for (int i=0;i< dp.length;i++){
                for (int j=0;j<dp[0].length;j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 3};
            System.out.println(mcm(arr));
        }

}
