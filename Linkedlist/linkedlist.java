package Linkedlist;

import java.util.LinkedList;

public class linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data  = data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //step 1 = create new node
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head;

        // step 3 - head = newnode
        head = newNode;
    }

    public void  addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void  print(){
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String args[]){
        LinkedList Ll = new LinkedList ();
        Ll.addFirst(2);
        Ll.addFirst(1);
        Ll.addLast(3);
        Ll.addLast(4);
    }
}
