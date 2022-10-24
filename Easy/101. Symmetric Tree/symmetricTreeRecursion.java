
/**
 * Submitted: 10/24/2022
 * 
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * 
 * Constraints:
 *      The number of nodes in the tree is in the range [1, 1000].
 *      -100 <= Node.val <= 100
 */

public class symmetricTreeRecursion {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: root = [1,2,2,3,4,4,3]
         * Output: true
         */

        /**
         * Example 2:
         * Input: root = [1,2,2,null,3,null,3]
         * Output: false
         */
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }

    public static boolean helper(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        if(left.val != right.val) return false;
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}
