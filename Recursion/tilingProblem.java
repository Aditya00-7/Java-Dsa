package Recursion;

public class tilingProblem {
    public static int tilprblm(int n){ // 2*n (floor size)

       //base case
        if (n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = tilprblm(n-1);

        // horizontal choice
        int fnm2 = tilprblm(n-2);

        int totalways = fnm1+ fnm2;
        return totalways;

    }
    public static void main(String[] args) {
        System.out.println(tilprblm(5));
    }
}
