import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                found=true;
            }
        }
        if(found){
            System.out.println("Key is found");
        }
        else{
            System.out.println("Key is not found");
        }
    }
}
