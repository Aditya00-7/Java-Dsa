import java.util.*;
public class Variables {

    public static void main(String args[]){
        System.out.println("Hello world");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        a= 50;
        System.out.println(a);
        byte v= 0;
        System.out.println(v);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        float price = (float) 10.8;
        int u = 20;
        int c = 45;
        int sum=u+c;
        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        String input =sc.next();
        System.out.println(input);
        String name = sc.nextLine();
        System.out.println(name);
        Scanner sc1 =new Scanner(System.in);
        int f = sc.nextInt();
        int g = sc.nextInt();
        int sum2 = f+g;
        int product = a*b;
        //System.out.println(a+b);
        System.out.println(sum2);
        System.out.println(product);
        Scanner sc3= new Scanner(System.in);
        float h= 45.98f;
        int j= (int) h;
        System.out.println(j);
        byte q= 4;
        char l= 'a';
        short s = 512;
        int i = 1000;
        float f1=3.14f;
        double d =99.9954;
        System.out.println((f1*q)+(i % l)-(d*s));



    }
}
