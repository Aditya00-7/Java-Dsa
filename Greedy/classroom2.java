package Greedy;
import java.util.*;
import java.lang.reflect.Array;
import java.util.Comparator;

public class classroom2 {
    public static void main(String[] args) {
        int val[] = {60,100,120,180};
        int weight[] ={10,20,30,25};
        int w = 50;


        double ratio [][] = new double[val.length][2];
        for (int i=0;i< val.length;i++){
            ratio[i][0]=i;
            ratio [i][1] = val[i]/(double)weight[i];
        }
        // ascending order
        Arrays.sort(ratio,
                Comparator.comparingDouble(o -> o[1]));


        int capcity = w;
        int finalval =0;
        for (int i= ratio.length-1;i>=0;i--){
            int idx =(int)ratio[i][0];
            if (capcity>=weight[idx]){
                finalval += val[idx];
                capcity-= weight[idx];
            }else{
                // include fractional item
                finalval+=(ratio[i][1]*capcity);
                capcity =0;
                break;
            }
        }
        System.out.println("final value = "+ finalval);
    }
}
