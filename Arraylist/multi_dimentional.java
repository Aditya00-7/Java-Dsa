package Arraylist;

import java.util.ArrayList;

public class multi_dimentional {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);
        mainlist.add(list);
        ArrayList<Integer>list3= new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();

        for (int i=1;i<=6;i++){
            list3.add(i*1);
            list4.add(i*2);
            list5.add(i*3);
        }
        mainlist.add(list3);
        mainlist.add(list4);
        mainlist.add(list5);
        System.out.println(mainlist);

        // nested loop
       //  for (int i=0;i<mainlist.size();i++){
        //      ArrayList<Integer> currlist = mainlist.get(i);
      //      for (int j= 0;j<currlist.size();j++){
      //          System.out.print(currlist.get(j)+" ");
      //      }
      //      System.out.println();
      //  }



        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);list2.add(4);
        mainlist.add(list2);

        for (int i =0;i<mainlist.size();i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}
