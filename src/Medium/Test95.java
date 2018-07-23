package Medium;
// DP problem
// correct answer

import Easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test95 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<>();
        return getTrees(1, n);
    }

    private List<TreeNode> getTrees(int start, int end) {
        List<TreeNode> results = new ArrayList<>();
        if (start > end) {
            results.add(null);
            return results;
        }
        if (start == end) {
            TreeNode t = new TreeNode(start);
            results.add(t);
            return results;
        }
        List<TreeNode> leftTree,rightTree;
        for (int i = start; i <= end; i++) {
            leftTree = getTrees(start, i-1);
            rightTree = getTrees(i+1, end);
            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode t = new TreeNode(i);
                    t.left = left;
                    t.right = right;
                    results.add(t);
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Test95 t = new Test95();
        List<TreeNode> list = t.generateTrees(0);
        System.out.println(list);
    }
}
