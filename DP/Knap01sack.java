package DP;

public class Knap01sack {

    public static int knapsack(int  val[],int wt[],int W,int n,int dp[][]){
        if (W==0||n==0){
            return 0;
        }
        if (dp[n][W]!=-1){
            return dp[n][W];
        }
        if (wt[n-1]<=W){//valid
            //include
            int ans1  = val[n-1]+knapsack(val,wt,W-wt[n-1],n-1,dp);
            //exclude
            int ans2 = knapsack(val, wt, W, n-1,dp);
            dp[n][W] = Math.max(ans1,ans2);
            return dp[n][W];
           //  return Math.max(ans1,ans2); for recursion
        }else {
            dp[n][W]= knapsack(val, wt, W, n-1, dp);
            return dp[n][W];
             // return knapsack(val,wt,W,n-1,dp);for recursion
        }
    }
    public static void main(String[] args) {
        int val[]={5,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W =7;

        // Memoizataion
        int dp[][] = new int [val.length+1][W+1];
         for (int i=0;i< dp.length;i++){
             for (int j=0;j<dp[0].length;j++){
                 dp[i][j]=-1;
             }
         }

        System.out.println(knapsack(val,wt,W, val.length,dp));
    }
}
