import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer> set=new HashSet<>();
        boolean containsDuplicate=false;
        for(int i:arr){
            if(set.contains(i)){
                containsDuplicate=true;
                break;
            }
            else{
                set.add(i);
            }
        }
        if(containsDuplicate){
            System.out.print("Contains Duplicate");
        }
        else{
            System.out.print("doesnt contains duplicate");
        }
    }
}
