/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> curList = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode rem = q.remove();
                if (rem.left != null) {
                    q.add(rem.left);
                }
                if (rem.right != null) {
                    q.add(rem.right);
                }
                curList.add(rem.val);
            }
            res.add(curList);
        }

        return res;
    }
}