package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class classroom2 {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String args[]){
        // classname objectName =new classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(10);

        int idx1 = 1,idx2 =3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);

        int max = Integer.MIN_VALUE;

        // max = Math.max(max,list.get(i));
        for (int i=0;i<list.size();i++){
            if (max<list.get(i)){
                max =list.get(i);
            }
        }
        System.out.println("max element = "+ max);



        // sorting
        // ascending
        Collections.sort(list);
        System.out.println(list);

        //descending,collection.reverse-order is comparator
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
