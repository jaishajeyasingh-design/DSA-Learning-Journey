public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3}; // Example array
        int val = 3; // Value to remove
        int newLength = removeElement(nums, val);

        // Print the modified array and its new length
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of the next element to keep
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // Keep the element and move the pointer
            }
        }
        return k; // Return the new length of the array
    }
}
