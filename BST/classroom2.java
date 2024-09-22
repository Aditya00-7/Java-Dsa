package BST;

public class classroom2 {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }

    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void printinrange(Node root, int k1,int k2){
        if (root==null){
            return;
        }
        if (root.data>=k1&& root.data<= k2){
            printinrange(root.left,k1,k2);
            System.out.println(root.data+" ");
            printinrange(root.right,k1,k2);
        } else if (root.data< k1) {
            printinrange(root.left,k1,k2);
        }
        else {
            printinrange(root.right,k1,k2);
        }
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root =null;
        inorder(root);
        System.out.println();
        printinrange(root,5,12);

    }
}
