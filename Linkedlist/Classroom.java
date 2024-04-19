package Linkedlist;
import java.util.LinkedList;
public class Classroom {
    public static void main(String[] args) {
        // create - object can be stored, premative data type(int,float,boolean cant be taken)-> object will be Integer, float, character
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0>1>2
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
