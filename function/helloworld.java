package function;
import java.util.*;
public class helloworld {
     public static void printHelloworld (){
         System.out.println("Hello World");
         return;
    }
    public static void calculatesum(int a,int b){
         int sum = a+b;
        System.out.println("sum is :"+ sum);
    }
    public static int product(){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int product = a*b;
        System.out.println(product);
        return product;
    }

    public static void main(String[] args) {
         printHelloworld();
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
         calculatesum(a,b);
         product();
    }
}
