package Map;
import java.util.*;
public class FrequencyArray {
    public static void main(String[] args){
        String s="aababcbaabcd";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key,map.get(key)+1);
            }
        }
        System.out.println(map);
    }
}
