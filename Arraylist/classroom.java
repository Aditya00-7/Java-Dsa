package Arraylist;

import java.util.ArrayList;

public class classroom {
    public static void main(String args[]){
        // classname objectName =new classname();
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
       System.out.println(list.size());

       // reverse print - 0(n)
       for (int i =list.size()-1;i>=0;i--){
           System.out.print(list.get(i));
       }
        System.out.println();

        // get operation
        int element = list.get(2);
        System.out.println(element);

        // delete
        list.remove(2);
        System.out.println(list);

        //set
        list.set(3,10);
        System.out.println(list);


    }
}
