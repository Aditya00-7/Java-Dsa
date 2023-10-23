package Array;

public class reversearray {
    public static void reverse(int numbers[]){
      int first =0,last =numbers.length-1;
      while(first<last){
          int temp = numbers[last];
          numbers[last]=numbers[first];
          numbers[first] =temp;
          first++;
          last--;
       }

    }

    public static void main(String[] args) {
         int number []={2,4,6,8,10};
         reverse(number);
         for (int i=0;i<number.length;i++){
             System.out.print(number[i]+ " ");
         }
        System.out.println();
    }
}
