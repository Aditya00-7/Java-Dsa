package Binarytree;
import java.util.*;

// checking wether the subtree is identical or not
public class classroom2 {

    static class Node {
        int data;
        classroom2.Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node node, Node subroot){
        if (node== null && subroot ==null){
            return true;
        } else if (node == null || subroot == null||node.data!= subroot.data) {
            return false;
        }
        if (!isIdentical(node.left,subroot.left)){
            return false;
        }
        if (!isIdentical(node.right, subroot.right)) {
            return false;
        }
        return true;
    }
    public static boolean issubtree(Node root, Node subroot){
        if (root == null){
            return false;
        }
        if (root.data== subroot.data){
            if (isIdentical(root, subroot)){
                return true;
            }
        }
        return issubtree(root.left, subroot) || issubtree(root.right,subroot);
    }


    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           /\   /\
          4 5   6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.left = new Node(7);

        /*
                 2
                /\
               4  5
                           */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(issubtree(root,subroot));

    }
}
