package Set;
import java.util.*;
public class LinkedHashset {
    public static void main(String[] args){
        Set<Integer> s=new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        s.add(90);
        s.add(30);
        s.add(40);
        s.add(10);
        System.out.println(s);
        for(int i:s){
            System.out.println(i);
        }
        s.remove(40);
        System.out.println(s);
    }
}
