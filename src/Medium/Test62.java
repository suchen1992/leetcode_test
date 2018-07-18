package Medium;
// DP problem
// correct answer

public class Test62 {
    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) return 1;
        int[][] results = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0)
                    results[i][j] = 1;
                else results[i][j] = results[i-1][j] + results[i][j-1];
            }
        }
        return results[m-1][n-1];
    }

    public static void main(String[] args) {
        Test62 t = new Test62();
        int result = t.uniquePaths(3, 3);
        System.out.println(result);
    }
}
