package Recursion;

public class Pairing_problm {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        // single
        int fnm1 = friendsPairing(n-1);
         // pair
         int fnm2 = friendsPairing(n-2);
         int pairways = (n-1)*fnm2;

         // total ways
        int totways = fnm1 +pairways;
        return totways;
    }

    // print string
    public static void printBinStrings(int n , int lastPlace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // work to do
        //if(lastPlace == 0){
            // sit on the chair n
         //   printBinStrings(n-1,0,str +"0");
        //    printBinStrings(n-1,1,str + "1");
       // }else {
         //   printBinStrings(n-1,0,str+"0");
       // }
        // Also written as ## smple way to write it.
        printBinStrings(n-1,0,str+"0");
        if(lastPlace==0){
            printBinStrings(n-1,1,str+"1");
        }

    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(6));
        printBinStrings(9,0, "");
    }
}
