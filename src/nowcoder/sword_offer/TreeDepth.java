package nowcoder.sword_offer;
// correct answer

import Easy.TreeNode;

public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return 1 + Math.max(left, right);
    }
}
