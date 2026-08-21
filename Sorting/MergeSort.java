//Divide and Merge Recursively
import java.util.*;
class MergeSort{
    public static void mergeSort(int[] arr,int low,int high){
        if(low==high)return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int temp[]=new int[high-low+1];
        int k=0;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left];
                left++;
            }
            else{
                temp[k++]=arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[k++]=arr[left];
            left++;
        }
        while(right<=high){
            temp[k++]=arr[right];
            right++;
        }
        // Copy the sorted elements back to the original array
        for(int i=low,j=0;i<=high;i++,j++){
            arr[i]=temp[j];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}