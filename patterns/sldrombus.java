package patterns;

public class sldrombus {
    public static void rombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void holl_rombus(int n){
        //spaces
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle-stars
            for(int j =1;j<=n;j++){
                    // cell-(i,j)
                    if (i==1||i==n || j==1 || j== n ){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
          // rombus(5);
        holl_rombus(6);
    }
}
