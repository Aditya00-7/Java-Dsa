package patterns;

public class inv_rot_halfpyramind {
  public static void pyramid(int n){
      //outer loop
      for (int i =1; i<=n; i++){
          //spaces
          for (int j=1;j<=n-i;j++){
              System.out.print(" ");
          }
          //stars
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          System.out.println();
      }
  }
  public static void inv_hal_pyramid_withnumbers(int n){
      for (int i=1;i<=n;i++){
          for(int j=1;j<=n-i+1;j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }
  }
  public static void main(String[] args) {
      pyramid(5);
      inv_hal_pyramid_withnumbers(8);
  }
}
