package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indiancoins {
    public static void main(String[] args) {
        Integer coins[] ={1,2,5,10,20,50,100,200,500};

        Arrays.sort(coins, Comparator.reverseOrder());


        int  countofcoins = 0;
        int amount = 689;
        ArrayList<Integer>ans = new ArrayList<>();

        for(int i=0; i<coins.length;i++){
            if (coins[i]<= amount){
                while (coins[i]<= amount){
                    countofcoins++;
                    ans.add(coins[i]);
                    amount-= coins[i];
                }
            }
        }
        System.out.println("Total (min)coins used = "+ countofcoins);

        for (int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
