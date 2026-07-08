import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("The second largest element in the array is: " + nums[nums.length - 2]);
    }

}

