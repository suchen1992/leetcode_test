package Easy;

public class Test35 {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end)/2;
        while (end >= start) {
            mid = (start + end)/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        if (nums[mid] < target)
            mid++;
        return mid;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int mid = Test35.searchInsert(nums, 2);
        System.out.println(mid);
    }
}
