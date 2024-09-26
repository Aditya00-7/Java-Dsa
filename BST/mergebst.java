package BST;

import java.util.ArrayList;

public class mergebst {
     static class Node{
         int data;
         Node left;
         Node right;

         public Node (int data){
             this.data = data;
             this.left= this.right=null;

         }
     }
    public static void preorder(Node root){
        if (root== null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
     public static void getInorder(Node root, ArrayList<Integer>arr){
         if (root == null){
             return;
         }
         getInorder(root.left,arr);
         arr.add(root.data);
         getInorder(root.right,arr);
     }
     public static Node createbst(ArrayList<Integer>arr,int st,int end){
         if (st >end){
             return null;
         }
         int mid = (st+end)/2;
         Node root = new Node(arr.get(mid));
         root.left = createbst(arr, st,mid-1);
         root.right = createbst(arr,mid+1,end);
         return root;
     }
     public static Node mergeBSTs(Node root1,Node root2){
         // step 1
         ArrayList<Integer>arr1 = new ArrayList<>();
         getInorder(root1,arr1);

         // step 2
         ArrayList<Integer>arr2 = new ArrayList<>();
         getInorder(root2,arr2);

         // merge two sorted arrays
         int i= 0,j=0;
         ArrayList<Integer>finalarr = new ArrayList<>();
         while (i< arr1.size()&&j<arr2.size()){
             if (arr1.get(i)<=  arr2.get(j)){
                 finalarr.add(arr1.get(i));
                 i++;
             }else {
                 finalarr.add(arr2.get(j));
                 j++;
             }
         }
         //add remaning elements for arr1 ,if any
         while (i<arr1.size()){
             finalarr.add(arr1.get(i));
             i++;
         }
         //add remaning elements for arr2 ,if any
         while(j<arr2.size()){
             finalarr.add((arr2.get(j)));
             j++;
         }
         // sorted al-> balanced bst
         return createbst(finalarr,0,finalarr.size()-1);
     }

    public static void main(String[] args) {
        /*    2
             /\
            1  4
            BST 1
        */
        Node root1 = new Node(2);
        root1.left= new Node(1);
        root1.right = new Node(4);

        /*

         9
        / \
       3   12

        */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*   3
            / \
           1   9
           \  /\       
           2 4  12
        */
        Node root = mergeBSTs(root1,root2);
        preorder(root);
    }
}
