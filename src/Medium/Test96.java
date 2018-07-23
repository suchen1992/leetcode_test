package Medium;
// DP problem
// correct answer

public class Test96 {
//    public int numTrees(int n) {
//        int [] G = new int[n+1];
//        G[0] = G[1] = 1;
//
//        for(int i=2; i<=n; ++i) {
//            for(int j=1; j<=i; ++j) {
//                G[i] += G[j-1] * G[i-j];
//            }
//        }
//
//        return G[n];
//    }
    int[] resultMap;
    int resultTemp = 0;

    public int numTrees(int n) {
        resultMap = new int[n+1];
        resultMap[1] = 1;
        if (n < 2) return resultMap[n];
        resultMap[2] = 2;
        recur(n);
        return resultMap[n];
    }

    private int recur(int n) {
        if (n == 0) return 1;
        if (resultMap[n] != 0)
            return resultMap[n];
        else {
            for (int i = 1; i <= n; i++) {
                resultTemp = resultTemp + recur(i-1)*recur(n-i);
            }
            resultMap[n] = resultTemp;
            return resultMap[n];
        }
    }

    public static void main(String[] args) {
        Test96 t = new Test96();
        int result = t.numTrees(4);
        System.out.println(result);
    }
}
