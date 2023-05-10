public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int first = 0;
        int last = nums.length - 1;
        swap(nums, first, last);
        for(int num : nums) {
            System.out.println(num);
        }
    }

    private static void swap(int[] nums, int index1, int index2) {
        // limit should be while index1 is less than index 2
        for(index1 = 0; index1 < index2; index1++) {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
            index2--;
        }
    }
}
