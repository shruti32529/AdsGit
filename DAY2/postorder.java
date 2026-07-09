
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class postorder {

    static class Solution {

        public List<Integer> postorderTraversal(TreeNode root) {

            List<Integer> result = new ArrayList<>();

            if (root == null) {
                return result;
            }

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {

                TreeNode current = stack.pop();

                result.add(current.val);

                // Push left first
                if (current.left != null) {
                    stack.push(current.left);
                }

                // Push right second
                if (current.right != null) {
                    stack.push(current.right);
                }
            }

            // Reverse Root-Right-Left to Left-Right-Root
            Collections.reverse(result);

            return result;
        }
    }

    public static void main(String[] args) {

    

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);

        Solution obj = new Solution();

        List<Integer> ans = obj.postorderTraversal(root);

        System.out.println(ans);
    }
}