package Binarytree;

public class classroom {

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

       public static int count(Node root){
        if (root== null){
            return 0;
          }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount+rightcount+1;
       }
        public static int sum(Node root){
        if(root== null){
            return 0;
           }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum+rightsum+ root.data;
        }

// approch 1 to calculate diameter
        public static int diameter2(Node root){
        if (root==null){
            return 0;
          }
              int leftdiam = diameter2(root.left);
            int leftht = height(root.left);
            int rightdiam = diameter2(root.right);
            int rightht = height(root.right);

            int selfdiam = leftht+ rightht+1;
            return Math.max(selfdiam,Math.max(leftdiam,rightdiam));
        }

    // approch 2 to calculate diameter

    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam = diam;
            this.diam =ht;
        }
    }
     public static Info diamter(Node root){
        if (root==null){
            return new Info(0,0);
        }
         Info leftInfo = diamter(root.left);
         Info rightInfo = diamter(root.right);

         int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
         int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
         return new Info(diam,ht);
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
        root.right.left = new Node(2);
        root.right.left = new Node(2);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diameter2(root));

        //something is wrong
        System.out.println(height(root));
        System.out.println(diamter(root).diam);


    }
}
