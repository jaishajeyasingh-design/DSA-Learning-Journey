import java.util.*;
public class JumpGame{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int [] arr=new int[n]; 
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean canJump=canJump(arr);
        if(canJump){
            System.out.println("You can reach the last index.");
        } else {
            System.out.println("You cannot reach the last index.");
        }
    }
    public static boolean canJump(int[] nums) {
        int maxReach = 0; // The farthest index we can reach
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // If the current index is beyond the farthest reachable index, return false
            }
            maxReach = Math.max(maxReach, i + nums[i]); // Update the farthest reachable index
        }
        return true; // If we can reach or exceed the last index, return true
    }
}