package Easy;

public class Test27 {
    public static int removeElement(int[] nums, int val) {
        int preIndex = 0;

        for (int num : nums) {
            if (num != val)
                nums[preIndex++] = num;
        }

        return preIndex;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int length = Test27.removeElement(nums, 2);
        System.out.println(length);
    }
}
