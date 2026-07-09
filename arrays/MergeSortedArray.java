

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0}; // Example array with extra space
        int m = 3; // Number of initialized elements in nums1
        int[] nums2 = {2, 4, 6}; // Second sorted array
        int n = nums2.length; // Number of elements in nums2

        merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for the last initialized element in nums1
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
