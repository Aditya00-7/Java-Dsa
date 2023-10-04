package patterns;

public class hollow_rectangle {
    public static void hollow_rect(int totrow,int totcols){
        //outer loop
        for(int i=1;i<=totrow;i++){
            for(int j =1;j<=totcols;j++){
                // cell-(i,j)
                if (i==1||i==totrow || j==1 || j== totcols){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rect(10,8);
    }
}
