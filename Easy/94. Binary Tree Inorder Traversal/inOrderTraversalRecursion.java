import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */

public class inOrderTraversalRecursion {
   
    public static void main(String[] args) {
        /**
         * Example 1:
         * input: root = [1,null,2,3]
         * output: [1,3,2]
         */

        /**
         * Example 2:
         * input: root = []
         * output: []
         */

        /**
         * Example 3:
         * input: root = [1]
         * output: 1
         */
    }

    /**
     * Recursion method with a helper function
     * 
     * Time: O(n) - recursive function is T(n) = 2T(n/2) + 1
     * Space: worst case is O(n) and average case is O(log n) where n is number of nodes
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if(root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

}
