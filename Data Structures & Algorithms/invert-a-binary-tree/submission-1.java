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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public void swap(TreeNode r1)
    {
        TreeNode temp = r1.left;
        r1.left =r1.right;
        r1.right = temp;
    }
}
