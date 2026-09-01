package Map;
import java.util.*;
public class Hashmap {
    public static void main(String [] args){
        Map<Integer,Integer> m=new HashMap<>();
        m.put(1,10);
        m.put(2,20);
        m.put(3,30);
        System.out.println(m.get(1));
        System.out.println(m.keySet());
        System.out.println(m.values());
        m.remove(1);
        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue(50));
        System.out.println(m.entrySet());
        m.clear();
        System.out.println(m.entrySet());
        System.out.println(m.isEmpty());
        System.out.println(m.size());
    }
}
