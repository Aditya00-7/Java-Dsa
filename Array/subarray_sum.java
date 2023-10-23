package Array;

public class subarray_sum {
    public static void maxsubarrays(int numbers[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;i++){
                int end =j;
                currSum =0;
                for(int k= start;k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.print(currSum);
                if(maxSum<currSum){
                    maxSum =currSum;
                }
            }
        }
        System.out.println("max sum ="+ maxSum);

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxsubarrays(numbers);
    }
}
