package Linkedlist;

import org.w3c.dom.Node;

import static Linkedlist.linkedlist.head;

public class Cycle {

    public static boolean isCycle(){// floy's cycle finding algorithm
        linkedlist.Node slow = head;
        linkedlist.Node fast =head;

        while (fast != null&& fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    public static  void  removeCycle(){
        // detect cycle
        Node slow = (Node) head;
        linkedlist.Node fast = head;
        boolean cycle = false;
        
        while (fast != null &&fast.next!=null) {
            //slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                cycle = true;
                break;
            }
        }
        if (cycle==false){
            return;
        }
        // find meeting point
        slow = (Node) head;
        Node prev = null;
        while (slow!=fast){
            prev = (Node) fast;
            slow = slow.getNextSibling();
            fast = fast.next;
        }
        // remove cycle -> last.next = null
     //   prev.next = 1;

    }

    public static void main(String args[]){
        head = new linkedlist.Node(1);
        linkedlist.Node temp = new linkedlist.Node(2);
        head.next =temp;
        //head.next = new linkedlist.Node(2);
        head.next.next = new linkedlist.Node(3);
        head.next.next.next=temp;
        //1>2>3>1
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
