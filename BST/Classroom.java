package BST;

public class Classroom {
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

    public static Node insert(Node root,int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.data>val){
            // left subtree
            root.left = insert(root.left,val);
        }else{
            // right subtree
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static boolean search(Node root,int key){
        if (root == null){
            return false;
        }
        if (root.data== key){
            return true;
        }
        if (root.data>key){
            return search(root.left,key);
        }
        else {
            return search(root.right,key);
        }
    }

    // delete a node
    public static Node delete(Node root,int val){
        if (root.data<val){
            root.right  = delete(root.right,val);
        } else if (root.data>val) {
            root.left = delete(root.left,val);
        }
        else {//voila
            //case1 - leaf node
            if (root.left== null&&root.right ==null){
                return null;
            }
            // case 2 - single child
            if (root.left== null){
                return root.right;
            } else if (root.right== null) {
                return root.left;
            }

            // case 3
            Node IS = findinordersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findinordersuccessor(Node root){
        while(root.left!=null){
            root= root.left;
        }
        return root;
    }

    public static void printinrange(Node root, int k1, int k2){
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
        int value []= {8,5,3,1,4,6,10,11,12};
        Node root = null;
        for (int i =0;i< value.length;i++){
            root = insert(root,value[i]);
        }
        inorder(root);
        System.out.println();

        if (search(root,9)){
             System.out.println("found");
        }else {
            System.out.println("Not found");
        }
         root = delete(root,1);
        System.out.println();
        inorder(root);

        printinrange(root,5,12);

    }

}
