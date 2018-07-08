package Easy;
// DP Problem
// correct answer
// 动态规划问题是将一个完整问题转变为子问题，
// 所以关键在于子问题格式

public class Test53 {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int serialMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            serialMax = Math.max(serialMax+nums[i], nums[i]);
            max = Math.max(max, serialMax);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Test53.maxSubArray(arr);
        System.out.println(max);
    }
}
