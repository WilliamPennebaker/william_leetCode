import java.util.LinkedList;
import java.util.Queue;

/**
 * Submitted: 10/24/2022
 * 
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * 
 * Constraints:
 *      The number of nodes in the tree is in the range [1, 1000].
 *      -100 <= Node.val <= 100
 */

public class symmetricTreeIter {
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

    /**
     * Time: O(n) - looping through our linkedlist
     * Space: O(n) - needing extra space for linkedlist
     */
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root.left);
        queue.offer(root.right);

        while(!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            if(node1 == null && node2 == null) continue;
            if(node1 == null || node2 == null) return false;
            if(node1.val != node2.val) return false;

            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }
        return true;
    }
}

