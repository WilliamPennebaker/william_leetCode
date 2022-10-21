import java.util.ArrayList;
import java.util.List;

/**
 * Submitted: 10/21/2022
 * 
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * 
 * Constraints:
 *      The number of nodes in the tree is in the range [0, 100].
 *      -100 <= Node.val <= 100
 * 
 * 
 * 
 * 1. Visit root node
 * 2. Traverse the left sub-tree
 * 3. Traverse the right sub-tree
 */

public class morrisPreOrderTraversal {
    
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

    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        TreeNode curr = root;
        TreeNode pre;

        while(curr != null) {
            if(curr.left == null) {
                list.add(curr.val);
                curr = curr.right;
            } else {
                pre = curr.left;
                while (pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }
                if(pre.right == null) {
                    list.add(curr.val);
                    pre.right = curr;
                    curr = curr.left;
                } else {
                    pre.right = null;
                    curr = curr.right;
                }
            }
        }
        return list;
    }

}
