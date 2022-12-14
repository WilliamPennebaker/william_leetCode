import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Submitted: 10/20/2022
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * 
 * 1. Traverse the left sub-tree until you reach a leaf node
 * 2. Visit the root node
 * 3. Traverse the right sub-tree until you reach a leaf node
 */

public class inOrderTraversalIter {
   
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
     * Iterating using a stack
     * 
     * Time: O(n)
     * Space: O(n)
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }

}
