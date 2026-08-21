import java.util.*;
public class MinAbsoluteDifference {
    public static void minAbsoluteDifference(int[] arr,int n){
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        System.out.println("The minimum absolute difference is: "+minDiff);
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
        minAbsoluteDifference(arr,n);
    }
}