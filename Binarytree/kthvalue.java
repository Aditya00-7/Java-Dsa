package Binarytree;

public class kthvalue {

    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int kancestor(Node root,int n, int k){
        if (root== null){
            return -1;
        }
        if (root.data==n){
            return 0;
        }
        int leftdist =kancestor(root.left,n,k);
        int rightdist = kancestor(root.right,n,k);

        if (leftdist ==-1 && rightdist==-1){
            return -1;
        }
        int max =Math.max(leftdist,rightdist);
        if (max+1==k){
            System.out.println(root.data);
        }
        return max+1;
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
        root.right.right = new Node(7);
        int n=5,k=2;
        kancestor(root,5,2);
    }
}
