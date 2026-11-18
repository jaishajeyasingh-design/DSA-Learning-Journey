import java.util.*;
public class Traversal{
    public static void main(String[] args){
        int[] arr={10,20,30,40};
        for(int i=0;i<arr.length;i++){//for loop
            System.out.println(arr[i]);
        }
        for(int value:arr){//enhanced for loop
            System.out.println(value);
        }
    }
}