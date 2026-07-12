public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3}; // Example sorted array with duplicates
        int newLength = removeDuplicates(nums);

        // Print the modified array and its new length
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums .length<=2) {
            return nums.length;
        }

        int k= 2; // Pointer for the position of the next element to keep
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k++] = nums[i]; // Keep the element and move the pointer
            }
        }
        return k;
    }
    
}
