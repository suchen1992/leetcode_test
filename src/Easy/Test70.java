package Easy;
// DP problem
// correct answer
public class Test70 {
    public int climbStairs(int n) {
        if (n < 1) return 0;
        if (n == 2) return 2;
        if (n == 1) return 1;
        int result = 0;
        int before2 = 1;
        int before1 = 2;
        for (int i = 3; i <= n; i++) {
            result = before1 + before2;
            before2 = before1;
            before1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Test70 test = new Test70();
        int result = test.climbStairs(3);
        System.out.println(result);
    }
}
