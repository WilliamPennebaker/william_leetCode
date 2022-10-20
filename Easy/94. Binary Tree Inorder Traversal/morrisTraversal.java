import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */

public class morrisTraversal {
   
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
     * Morris Traversal
     * 
     * Use a new data structure - Threaded Binary Tree
     * 
     * Step 1: Initialize current as root
     * Step 2: Whille current is not NULL
     * if current does not have left child
     *      a. add currents value
     *      b. go to the right, ie., current = current.right
     * else
     *      a. in currents left subtree, make current the right child of the rightmost node
     *      b. go to this left child, ie., current = current.left
     * 
     * Time: O(n) - Complexity of finding nodes in a binary tree is O(nlogn), finding predecessor node for a single node is related to the height of the tree.
     * However, finding the predecessor nodes for all nodes only needs O(n) time. Since a binary tree with n nodes has n-1 edges, the whole process for each edges up to 2 times,
     * one to locate the node and the other is to find predecessor node. So complexity is O(n).
     * Space: O(1) - Extra space is allocated for the arraylist of size n, however the output doesnt count towards the space complexity.
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        TreeNode pre;

        while(curr != null) {
            if(curr.left == null) {
                res.add(curr.val);
                curr = curr.right; // move to next right node
            } else { // has a left subtree
                pre = curr.left;
                while(pre != null) {
                    pre = pre.right;
                }
                pre.right = curr; // put cur after the pre node
                TreeNode temp = curr; // store cur node
                curr = curr.left; // move cur to the top of the new tree
                temp.left = null; // original cur left to null, to avoid infinite loops
            }
        }
        return res;
    }

}
