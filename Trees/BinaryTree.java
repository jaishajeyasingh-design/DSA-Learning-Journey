import  java.util.*;
class Node{
    Node left;
    int data;
    Node right;
    Node(int data){
        left=null;
        this.data=data;
        right=null;
    }
}
class BinaryTreeMethod{
    
        Scanner sc=new Scanner(System.in);
        public Node insert(){
            int value=sc.nextInt();
            if(value==-1)return null;
            Node newNode=new Node(value);
            System.out.println("Node to the left of "+value);
            newNode.left=insert();
            System.out.println("Node to the right of"+value);
            newNode.right=insert();
            return newNode;
        }
}
class BinaryTree{
    public static void main(String[] args){
        System.out.println("Binary Tree");
        BinaryTreeMethod b=new BinaryTreeMethod();
        b.insert();
        System.out.println("Completed");
    }
}