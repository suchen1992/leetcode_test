package Medium;
// correct answer

public class Test11 {
    public int maxArea(int[] height) {
        int pre = 0;
        int post = height.length-1;
        int max = 0;
        while (pre < post) {
            int line1 = Math.min(height[pre], height[post]);
            int line2 = post - pre;
            if (line1 * line2 > max)
                max = line1 * line2;
            if (height[pre] > height[post])
                post--;
            else pre++;
        }
        return max;
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = t.maxArea(height);
        System.out.println(result);
    }
}
