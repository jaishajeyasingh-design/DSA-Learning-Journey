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
}