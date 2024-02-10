package Recursion;

public class power {
    public  static int optimizedPower(int a,int n){
        if (n==0){
            return 1;
        }
       // int halfPowersq = optimizedPower(a,n/2)* optimizedPower(a,n/2);
        int halfpower = optimizedPower(a,n/2);
        int halfPowersq =halfpower*halfpower;

        // n is odd
        if(n%2 !=0){
            halfPowersq =a*halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
        int a =2;
        int n =4;
        System.out.println(optimizedPower(a,n));
    }
}
