package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (index > 0 && nums[index] == nums[index-1])
                continue;
            int pre = index + 1, post = nums.length - 1;
            while (pre < post) {
                if (nums[pre] + nums[post] < -nums[index]) pre++;
                else if (nums[pre] + nums[post] > -nums[index]) post--;
                else {
                    lists.add(Arrays.asList(nums[index],nums[pre++],nums[post--]));
                    while (pre < post && nums[pre] == nums[pre-1]) pre++;
                    while (pre < post && nums[post] == nums[post+1]) post--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        int[] nums = {-2,0,1,1,2};
        //int[] nums = {0,0,0,0,0};
        List<List<Integer>> lists = t.threeSum(nums);
        System.out.println(lists);
    }
}
