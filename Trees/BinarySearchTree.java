import java.util.*;
public class BinarySearchTree {
    public static void main(String[] args){
        BSTDemo b=new BSTDemo();
        b.add(10);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(2);
        b.add(15);
        b.add(20);
        b.add(22);
        System.out.println("Completed");
        b.inorder(b.root);
        System.out.println();
        b.preorder(b.root);
        System.out.println();
        b.postorder(b.root);
        System.out.println();
        b.LevelOrder();
        System.out.println();
        System.out.println(b.leafNodes(b.root));
        System.out.println(b.height(b.root));
        System.out.println(b.minValue(b.root).data);
        System.out.println(b.maxValue(b.root).data);
        System.out.println(b.search(b.root,22));
        System.out.println(b.internalNodes(b.root));
    }
}
class Node{
    Node left;
    int data;
    Node right;
    Node (int data){
        this.data=data;
    }
}
class BSTDemo{
    Node root;
    public void add(int data){
       
        root=recursion(root,data);
    }
    public Node recursion(Node node,int data){
        if(node==null){
            Node newNode=new Node(data);
            return newNode;
        }
        if(node.data>data){
            node.left=recursion(node.left,data);
        }
        else{
            node.right=recursion(node.right,data);
        }
        return node; 
    }
    public void inorder(Node node){
        if(node!=null){
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
        }
    }
    public void preorder(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void postorder(Node node){
        if(node!=null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data+" ");
        }
    }
    public void LevelOrder( ){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)q.offer(temp.left);
            if(temp.right!=null)q.offer(temp.right);
        }
    }
    public int leafNodes(Node node){
        if(node==null)return 0;
        if(node.left==null&&node.right==null)return 1;
        return leafNodes(node.left)+leafNodes(node.right);
    }
    public int height(Node node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }
    public Node minValue(Node node){
        if(node.left!=null){
            return minValue(node.left);
        }
        return node;
    }
    public Node maxValue(Node node){
        if(node.right!=null){
            return maxValue(node.right);
        }
        return node;
    }
    public  boolean search(Node node,int target){
        if(node==null)return false;
        if(node.data==target)return true;
        if(node.data>target){
            return search(node.left,target);
        }
        return search(node.right,target);
    }
    public int internalNodes(Node node){
        if(node==null)return 0;
        if(node.left==null&&node.right==null){
            return 0;
        }
        return 1+(internalNodes(node.left)+internalNodes(node.right));
    }
}