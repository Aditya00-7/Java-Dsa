import java.util.Scanner;

public class codition {
    public static void main(String args[]){
        int age = 22;
        if(age>=18){
            System.out.println("Adult : drive,vote");
        }
        else{
            System.out.println("not adult");
        }
        int a= 1;
        int b =5;
        if(a>=b){
            System.out.println("a is largest of 2");
        }else {
            System.out.println("b is largest of 2");
        }

      Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
        Scanner sc1 = new Scanner(System.in);
        int income = sc1.nextInt();
        int tax;
        if(income<5000000){
            tax=0;
        } else if (income>=5000000 && income<10000000) {
            tax =(int) (income*0.2);

        }
        else{
            tax =(int) (income*0.3);
        }
        System.out.println("Your tax is : " + tax);


        int number1 =2;
        switch (number1){
            case 1:
                System.out.println("Somasa");
                break;
            case 2 :
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("mango shake");
                break;
            default:
                System.out.println("we fuck up");
        }
    }
}



