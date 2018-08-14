package Medium;
// correct answer
// explanation: https://blog.csdn.net/zr1076311296/article/details/51296008

public class Test31 {
//    public void nextPermutation(int[] A) {
//        if(A == null || A.length <= 1) return;
//        int i = A.length - 2;
//        while(i >= 0 && A[i] >= A[i + 1]) i--; // Find 1st id i that breaks descending order
//        if(i >= 0) {                           // If not entirely descending
//            int j = A.length - 1;              // Start from the end
//            while(A[j] <= A[i]) j--;           // Find rightmost first larger id j
//            swap(A, i, j);                     // Switch i and j
//        }
//        reverse(A, i + 1, A.length - 1);       // Reverse the descending sequence
//    }
//
//    public void swap(int[] A, int i, int j) {
//        int tmp = A[i];
//        A[i] = A[j];
//        A[j] = tmp;
//    }
//
//    public void reverse(int[] A, int i, int j) {
//        while(i < j) swap(A, i++, j--);
//    }

    public void nextPermutation(int[] nums) {
        for (int pos = nums.length-1, posPre = pos-1; posPre >= 0; pos--, posPre--) {
            if (nums[pos] <= nums[posPre]) continue;
            int minGreatPos = nums.length-1;
            while (nums[minGreatPos] <= nums[posPre]) minGreatPos--;
            int temp = nums[posPre];
            nums[posPre] = nums[minGreatPos];
            nums[minGreatPos] = temp;
            partitions(nums, pos, nums.length-1);
            return;
        }
        partitions(nums, 0, nums.length-1);
    }

    void partitions(int[] nums, int low, int high) {
        if (low < high) {
            int mid = pivot(nums, low, high);
            partitions(nums, low, mid-1);
            partitions(nums, mid+1, high);
        }
    }

    int pivot(int[] nums, int low, int high) {
        int temp = nums[low];
        while (low < high) {
            if (low < high && nums[high] >= temp) high--;
            nums[low] = nums[high];
            if (low < high && nums[low] <= temp) low++;
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,1};
        Test31 t = new Test31();
        t.nextPermutation(nums);
        System.out.println(nums);
    }
}
