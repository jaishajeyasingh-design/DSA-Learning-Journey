package Map;
import java.util.*;
public class Hash {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            char key=sc.next().charAt(0);
            int value=sc.nextInt();
            m.put(key,value);
        }
        System.out.println(m.entrySet());
    }
}
