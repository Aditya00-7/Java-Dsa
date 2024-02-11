package Recursion;

public class convertToString {
    static String digits[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdigit(int number) {
        if (number == 0){
            return;
        }
        int lastDigit = number%10;
        printdigit(number/10);
        System.out.println(digits[lastDigit]+" ");
    }
    public static void main (String[]args){
        printdigit(1234566789);
        System.out.println();
    }
}