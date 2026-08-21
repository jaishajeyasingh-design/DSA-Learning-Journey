import java.util.*;
public class InsertionSortArrayList {
    public static void insertionSort(ArrayList<Integer> arr,int n){
        for(int i=1;i<=n-1;i++){
            int j=i;
            while(j>0&&arr.get(j)<arr.get(j-1)){
                int temp=arr.get(j);
                arr.set(j,arr.get(j-1));
                arr.set(j-1,temp);
                j--;
            }
            System.out.println("After inserting element at index "+i+" the array is:");
            for(int k=0;k<n;k++){
                System.out.print(arr.get(k)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        insertionSort(arr,n);
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
