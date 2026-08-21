import java.util.*;
public class BigSorting{
    public static void bigSort(String[] arr,int n){
        Arrays.sort(arr,(a,b)->{
            if(a.length()!=b.length()){
                return a.length()-b.length();
            }
            else{
                return a.compareTo(b);
            }
        });
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        bigSort(arr,n);
        System.out.println("Sorted array is:"); 
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}