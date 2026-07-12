import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3}; // Example array
        int majorityElement = findMajorityElementAlgorithm(nums);
        int element = findMajorityElementHash(nums);
        System.out.println("The majority element is: " + majorityElement);
        System.out.println("The majority element (using hash map) is: " + element);
    }

    public static int findMajorityElementAlgorithm(int[] nums) {
        int count = 0;
        int  candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if(candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
    public static int findMajorityElementHash(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }

        return -1; // This line should never be reached if a majority element exists
    }
}
