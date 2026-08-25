public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1}; // Example array
        if (isSorted(arr)) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in descending order.");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
