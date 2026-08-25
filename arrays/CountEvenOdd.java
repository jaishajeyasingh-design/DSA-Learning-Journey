import java.util.*;
public class CountEvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<n;i++ ){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }

        }
        System.out.println("Count of even numbers: "+countEven);
        System.out.println("Count of odd numbers: "+countOdd);
    }
}

