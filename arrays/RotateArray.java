public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int k = 3; // Number of rotations

        int[] resultFromRotate = nums.clone();
        rotate(resultFromRotate, k);
        System.out.println("Result from rotate():");
        printArray(resultFromRotate);

        int[] resultFromExtraArray = nums.clone();
        rotateExtraArray(resultFromExtraArray, k);
        System.out.println("\nResult from rotateExtraArray():");
        printArray(resultFromExtraArray);
    }

    public static void rotateExtraArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is larger than the array length
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        // Copy the rotated array back to the original array
        System.arraycopy(rotated, 0, nums, 0, n);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // Handle cases where k is larger than the array length
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
