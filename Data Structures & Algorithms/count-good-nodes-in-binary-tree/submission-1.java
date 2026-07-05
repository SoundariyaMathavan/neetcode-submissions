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
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        return helper(root,root.val);
    }
    public int helper(TreeNode root,int max)
    {
        if(root==null) return 0;
        if(root.val>=max)
        {
            max = root.val;
            count++;
        }
        helper(root.left,max);
        helper(root.right,max);
        return count;
    }
}
