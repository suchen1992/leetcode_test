package Medium;

public class Test64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] result = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0) result[j] = grid[i][j];
                    else result[j] = result[j-1] + grid[i][j];
                } else {
                    if (j == 0) result[j] = result[j] + grid[i][j];
                    else result[j] = Math.min(result[j-1], result[j]) + grid[i][j];
                }
            }
        }
        return result[n-1];
    }

    public static void main(String[] args) {
        Test64 t = new Test64();
        int[][] grid = new int[3][2];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[1][0] = 5;
        grid[1][1] = 6;
        grid[2][0] = 1;
        grid[2][1] = 1;
        int result = t.minPathSum(grid);
        System.out.println(result);
    }
}
