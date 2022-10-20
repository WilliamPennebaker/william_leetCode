

/**
 * Submitted: 10/20/2022
 * 
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * 
 * Constraints:
 *      The number of nodes in both trees is in the range [0,100].
 *      -10^4 <= Node.val <= 10^4
 */

public class sameTreeRecursion {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * input: p = [1,2,3], q = [1,2,3]
         * output: true
         */

        /**
         * Example 2:
         * input: p = [1,2], q = [1,null,2]
         * output: false
         */

        /**
         * Example 3:
         * input: p = [1,2,1], q = [1,1,2]
         * output: false
         */
    }

    /**
     * Recursion solution
     * Check if p and q nodes are not null and if their values are equal.
     * If they arent null and they equal each other then do the same for the child nodes.
     * 
     * Time: O(n) - N is a number of nodes in the tree, since one visits each node exactly once.
     * Space: O(n) - worse case of completely unbalanced tree, to keep a recursion stack.
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // p and q are both null
        if(p == null && q == null) return true;
        // one of p and q is null
        if(p == null || q == null) return false;
        // false when values dont equal each other
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}