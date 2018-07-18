package Medium;

public class Test63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if (obstacleGrid[m-1][n-1] == 1)
            return 0;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (obstacleGrid[i][j] == 1)
                        return 0;
                    else result[i][j] = 1;
                } else if (i == 0) {
                    if (obstacleGrid[i][j] == 1 || result[i][j-1] == 0)
                        result[i][j] = 0;
                    else result[i][j] = 1;
                } else if (j == 0) {
                    if (obstacleGrid[i][j] == 1 || result[i-1][j] == 0)
                        result[i][j] = 0;
                    else result[i][j] = 1;
                } else {
                    if (obstacleGrid[i-1][j]==1 && obstacleGrid[i][j-1]==1)
                        result[i][j] = 0;
                    else if (obstacleGrid[i-1][j]==1)
                        result[i][j] = result[i][j-1];
                    else if (obstacleGrid[i][j-1]==1)
                        result[i][j] = result[i-1][j];
                    else result[i][j] = result[i-1][j] + result[i][j-1];
                }
            }
        }
        return result[m-1][n-1];
    }

    public static void main(String[] args) {
        Test63 t = new Test63();
        int[][] obstacleGrid = new int[3][3];
        obstacleGrid[0][1] = 1;
        //obstacleGrid[1][0] = 1;
        int result = t.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(result);
    }
}
