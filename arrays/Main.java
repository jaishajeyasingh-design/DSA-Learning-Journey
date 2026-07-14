import java.util.*;

class RandomizedSet {

    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> list;
    private Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    // Insert
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    // Remove
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Move last element to the removed element's position
        list.set(index, lastElement);
        map.put(lastElement, index);

        // Remove last element
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    // Get Random
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

public class Main {

    public static void main(String[] args) {

        RandomizedSet rs = new RandomizedSet();

        System.out.println("Insert 1 : " + rs.insert(1));   // true
        System.out.println("Remove 2 : " + rs.remove(2));   // false
        System.out.println("Insert 2 : " + rs.insert(2));   // true
        System.out.println("Random   : " + rs.getRandom()); // 1 or 2
        System.out.println("Remove 1 : " + rs.remove(1));   // true
        System.out.println("Insert 2 : " + rs.insert(2));   // false
        System.out.println("Random   : " + rs.getRandom()); // 2

    }
}