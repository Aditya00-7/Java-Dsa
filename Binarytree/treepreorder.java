package Binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class treepreorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binarytree{
        static int idx =-1;

        public static Node buildtree(int  nodes[]){
          idx++;
          if (nodes[idx]==-1){
              return null;
          }
          Node newNode = new Node(nodes[idx]);
          newNode.left = buildtree(nodes);
          newNode.right = buildtree(nodes);

          return newNode;
        }
        public  static int preorder(Node root){
            if (root== null){
                return -1 ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            return 0;
        }

        // level order traversal
        public static void levelorder(Node root){
            if (root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode== null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(currNode.data+" ");
                    if (currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if (currNode.right !=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);

       tree.preorder(root);
        System.out.println(root.data);

        tree.levelorder(root);
    }
}
