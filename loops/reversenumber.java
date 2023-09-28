package loops;

import java.util.Scanner;

public class reversenumber {
    public static void main(String args[]){
        Scanner sc =new  Scanner(System.in);
        int n =sc.nextInt();
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n =n/10;
        }
        System.out.println();
        do{
            System.out.println("Enter your number");
            int n1= sc.nextInt();
            if(n1%10==0){
                break;
            }
            System.out.println(n1);
        }while(true);
    }

}
