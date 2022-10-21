import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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

public class postOrderTraversalIter {
    
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
    public static List<Integer> postOrderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            list.addFirst(curr.val);

            if(curr.left != null) stack.push(curr.left);
            if(curr.right != null) stack.push(curr.right);
        }
        
        return list;
    }

}
