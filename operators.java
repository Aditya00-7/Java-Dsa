import java.util.*;
public class operators {
    public static void main(String args[]){
        int a = 10;
       int b = 6;
       System.out.println("add = " + (a+b) );
        System.out.println("Subtract = " + (a-b));
        int c = ++a;
        System.out.println(a);
        System.out.println(c);
        int d =a++;
        System.out.println(a);
        System.out.println(d);
        System.out.println((a==b));
        System.out.println(a!= d);
        System.out.println((3>2)&&(5>0));
        System.out.println((3>2)|| (5>0));
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);


    }
}
