package Recursion;

public class RecursionBasics {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn =n * fact(n-1);
        return fn;
    }
    public  static int CalSum(int n){
        if(n ==1){
            return 1;
        }
        int Snm1 = CalSum(n-1);
        int Sn = n+Snm1;
        return Sn;
    }
    // calculate nth terms in fibonacci
    public static int fib(int n){
        if (n== 0 || n ==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 +fnm2;
        return fn;
    }

    // sorted array
    public static boolean isSorted(int arr[], int i){
      if (i== arr.length-1){
          return true;
      }
      if(arr[i]>arr[i+1]){
          return false;
      }
      return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[],int key, int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static int lastOccurance(int arr[],int key, int i){
        if(i== arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1 =power(x,n-1);
        int xn =x*xnm1;
        return xn;
        //or
        // return x * power(x,n-1);
    }
    public static void main(String[] args){
        int n =25;
        printDec(n);
        printInc(n);
        System.out.println(fact(n));
        System.out.println(CalSum(n));
        System.out.println(fib(n));
        int arr[] ={1,3,4,9,0,2,6,3,4,1,8,10};
        System.out.println(isSorted(arr,0));
        System.out.println(firstOccurence(arr,1,0));
        System.out.println(lastOccurance(arr,1,0));
        System.out.println(power(2,10));
    }
}
