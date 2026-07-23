public class MoveZeros {
    public void moveZeros(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros.moveZeros(nums);
        System.out.println("Array after moving zeros:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
