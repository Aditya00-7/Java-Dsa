package function;

import java.util.Scanner;

public class factorial {
    public static int facto(){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int f =1;
         for(int i=1;i<=n;i++){
             f=f*i;
         }
        System.out.println(f);
         return f;
    }
    //binary to decimal
    public static  void binrodec(int binnum){
        int mynumber =binnum;
        int pow =0;
        int decnum =0;
        while(binnum >0){
            int lastDigit =binnum%10;
            decnum = decnum +(lastDigit * (int)Math.pow(2,pow));
            pow++;
            binnum= binnum/10;
        }
        System.out.println("decimal of "+ mynumber+"="+decnum);
    }

    // binary to decimal
    public static void dectobin(int n){
        int pow =0;
        int mynum =n;
        int binnum = 0;
        while (n>0){
            int rem = n%2;
            binnum= binnum + (rem* (int)Math.pow(10,pow));
            pow++;
            n =n/2;
        }
        System.out.println("Binary form of "+ mynum +"="+ binnum);

    }



    public static void main(String[] args) {
        dectobin(9);

    }
}
