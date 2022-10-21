import java.util.ArrayList;
import java.util.List;

/**
 * Submitted: 10/21/2022
 * 
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * 
 * Constraints:
 * 
 * 
 * 
 * 
 * 1. Traverse the left sub tree
 * 2. Traverse the right sub tree
 * 3. Visit the root node
 */

public class postOrderTraversalRecursion {
    
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
    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public static void helper(TreeNode root, List<Integer> list) {
        if(root != null) {
            helper(root.left, list);
            helper(root.right, list);
            list.add(root.val);
        }
    }
}
