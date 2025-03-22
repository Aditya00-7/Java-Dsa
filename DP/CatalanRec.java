package DP;
// recurssion
public class CatalanRec {
    public static int pattern(int n){
        if (n == 0 || n==1 ){
            return 1;
        }
        int ans =0; //Cn
        for (int i=0;i<=n-1;i++){
            ans += pattern(i)*pattern(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(pattern(n));
    }
}
