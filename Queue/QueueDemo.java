package Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Demo code for Queue implemented with Array
        Queue q=new Queue();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.print();
        q.poll();
        q.print();
        System.out.println(q.count);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

    }
}
class Queue{
    int a[]=new int[5];
    int first=0;
    int last=-1;
    int size=a.length;
    int count=0;
    public void offer(int data){
        last++;
        if(last<size){
            a[last]=data;
            count++;
        }
        else{
            System.out.println("Queue is full");
            last--;
        }
    }
    public void print(){
        for(int i=first;i<=last;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public void poll(){
        if(count==0){
            System.out.println("Queue empty");
            return;
        }
        first++;
        count--;
    }
    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(count==size){
            return true;
        }
        return false;
    }
}
