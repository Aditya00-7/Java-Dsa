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
    public static int size;
    public void addFirst(int data){
        //step 1 = create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // unable to call from the main function
    public void print(){
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void  add(int idx, int data){
        if (idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if (head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2
        Node prev = head;
        for (int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // unable to call from the main function
    public int itrsearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!= null){
            if (temp.data == key){
                // key found
                return i;
            }
            temp =temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    // unable to call from the main function
    public int helper(Node head,int key){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int search(int key){
        return helper(head,key);
    }

    // unable to call from the main function
    public void  reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        head = prev;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next;//+2
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if (head == null || head.next!= null){
            return true;
        }
        // step 1- find mid
        Node MidNode =findMid(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = MidNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right != null){
            if (left.data!= right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]){
        LinkedList Ll = new LinkedList ();
        Ll.addFirst(2);
        Ll.addFirst(1);
        Ll.addLast(3);
        Ll.addLast(4);
        // Ll.print();
        Ll.add(2,9);
        System.out.println(Ll);
        System.out.println(Ll.size());
        Ll.removeFirst();
        System.out.println(Ll);
      //  Ll.removeLast();
        System.out.println(Ll);
        //  Ll.reverse();
        System.out.println(Ll);
        Ll.addLast(1);
        Ll.addLast(2);
        Ll.addLast(2);
        Ll.addLast(1);
        System.out.println(Ll);
      //  System.out.println(Ll.checkPalindrome);

    }
}
