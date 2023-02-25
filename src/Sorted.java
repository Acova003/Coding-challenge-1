import java.lang.reflect.Array;

class Sorted {
    public static void main(String[] args) {
        // [1,2,3,5,6]
        int[] nums = {3, 5, 1, 2, 6};  

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = 0;
                if (nums[i]> nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
            System.out.println(nums[i]);
        }
    }
}