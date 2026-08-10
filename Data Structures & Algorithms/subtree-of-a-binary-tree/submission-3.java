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
    public boolean isSubtree(TreeNode root, TreeNode subRoot)  {
        if(root==null)return false;
        if(root.val==subRoot.val && helper(root,subRoot))return true;
        if(isSubtree(root.left,subRoot)) return true;
        if(isSubtree(root.right,subRoot)) return true;
        return false;
    }
    public boolean helper(TreeNode p,TreeNode q)
    {
        if(p==null&&q==null)return true;
        if(p==null||q==null)return false;
        if(p.val!=q.val)
          return false;
        return helper(p.left,q.left)&&helper(p.right,q.right);
    }
}
