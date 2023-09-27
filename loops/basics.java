package loops;

import java.util.Scanner;

public class basics {
       public static void main(String args[]){
       int counter =0;
        while(counter < 10){
        System.out.println("Hello world");
        counter++;
        }
        System.out.println("Printing ended");

       // printing number from 1 to 9.
        int n =0;
        while (n <=10){
        System.out.print(n);
        n++;}
        // printing number from 1 to n
        Scanner sc =new Scanner(System.in);
        int range = sc.nextInt();
        int counter1 =1;
        while(counter1 <= range){
            System.out.print(counter1 +" ");
            counter1++;
        }
        System.out.println();
    }
}
