/*You are given a 0-indexed array of integers nums of length n. You are initially positioned at index 0.

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at index i, you can jump to any index (i + j) where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.*/
import java.util.Scanner;

public class JumpGameII{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array:"); 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minJumps=jump(arr);
        System.out.println("Minimum number of jumps to reach the last index: " + minJumps);
    }
    public static int jump(int[] arr){
        if(arr.length <= 1){
            return 0; // No jumps needed if there's one or no element
        }
        int jumps = 0; // Number of jumps made
        int currentEnd = 0; // The farthest we can reach with the current number of jumps
        int farthest = 0; // The farthest we can reach with the next jump

        for(int i = 0; i < arr.length - 1; i++){//we cant jump from the last index, so we go till arr.length - 1
            farthest = Math.max(farthest, i + arr[i]); // Update the farthest we can reach
            if(i == currentEnd){ // If we've reached the end of the current jump range
                jumps++; // We need to make a jump
                currentEnd = farthest; // Update the end of the current jump range
            }
        }
        return jumps;
    }
}