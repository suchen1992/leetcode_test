package Easy;

public class Test26 {
    public static int removeDuplicates(int[] nums) {
        int preIndex = 0;
        int postIndex = 0;

        while (postIndex < nums.length) {
            if (nums[preIndex] != nums[postIndex])
                nums[++preIndex] = nums[postIndex];
            postIndex++;
        }

        return preIndex+1;
    }

    public static void main(String[] args) {
        int[] temp = {0,0,1,1,1,2,2,3,3,4};
        int length = Test26.removeDuplicates(temp);
        System.out.println(length);
    }
}
