import java.util.LinkedList;
import java.util.Queue;

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

public class sameTreeIter {
    
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
     * Iteration method
     * Start from root and then at each iteration poll the current node.
     * if p and q are not null
     * if p.val is equal to q.val
     * if checks are ok then push offer child nodes
     * 
     * Time: O(n) - since each node is visited exactly once.
     * Space: O(n) - worst case the tree is a perfectly fully balanced binary tree, since BFS will have to store at least an entire
     * level in the queue, and the last level would be O(n) nodes.
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while(!queue.isEmpty()) {
            TreeNode one = queue.poll();
            TreeNode two = queue.poll();

            if(one == null && two == null) continue;
            if(one == null || two == null) return false;
            if(one.val != two.val) return false;

            queue.offer(one.left);
            queue.offer(two.left);
            queue.offer(one.right);
            queue.offer(two.right);
        }
        return true;
    }

}
