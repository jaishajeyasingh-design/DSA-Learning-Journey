package Set;
import java.util.*;
public class Treeset {
    public static void main(String[] args){
        SortedSet<Integer> s=new TreeSet<>();
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
