public class StackLLDemo {
    public static void main(String[] args) {
        // Demo code for Stack implemented with Linked List
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        s.pop();
        s.print();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.contains(30));
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node top;
    public void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    public void print(){
        Node curr=top;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println("------");
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return;
        }
        top=top.next;
    }
    public int peek(){
        if(top==null)return -1;
        return top.data;
    }
    public boolean isEmpty(){
        if(top==null)return true;
        else return false;
    }
    public boolean contains(int target){
        Node curr=top;
        while(curr!=null){
            if(curr.data==target)return true;
            curr=curr.next;
        }
        return false;
    }
}