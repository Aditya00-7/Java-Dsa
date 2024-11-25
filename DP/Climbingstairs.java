package DP;

import java.util.Arrays;

// meoization-O(n) || recursion(2^n) -> n

public class Climbingstairs {

    // memoization
    public static int countWays(int n,int ways[]){
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        if (ways[n] !=-1){ //allready calculated
            return ways[n];
        }
        ways[n] = countWays(n-1,ways)+countWays(n-2,ways);
        return ways[n];
    }

    // tabulation -O(n)
    public static int countwaytab(int n){
        int dp[]= new int[n+1];
        dp[0]=1;

        // tabulation loop
        for (int i=1;i<=n;i++){
            if (i==1){
                dp[i]=dp[i-1]+0;
            }else {
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        int ways[]= new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n,ways));
        System.out.println(countwaytab(n));
    }
}
