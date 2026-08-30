package QueueClass;

public class CircularQueueDemo {
    public static void main(String[] args) {
        // Demo code for Circular Queue implemented with Array
        CircularQueue q=new CircularQueue();
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
class CircularQueue{
    int a[]=new int[5];
    int first=0;
    int last=-1;
    int size=a.length;
    int count=0;
    public void offer(int data){
        last=(last+1)%size;
        if(count<size){
            a[last]=data;
            count++;
        }
        else{
            System.out.println("Queue is full");
            last=(last-1+size)%size;
        }
    }
    public void print(){
        for(int i=0;i<count;i++){
            System.out.print(a[(first+i)%size]+" ");
        }
        System.out.println();
    }
    public void poll(){
        if(count==0){
            System.out.println("Queue empty");
            return;
        }
        first=(first+1)%size;
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