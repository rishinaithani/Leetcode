/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    class Solution {
    
    private TreeNode result;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findLCA(root,p,q);
        return result;
          
    }
    
    private boolean findLCA (TreeNode root, TreeNode p, TreeNode q)
    {
        // recursive function... postorder traversal
        if (root == null) return false;
        boolean left = findLCA(root.left, p, q);
        boolean right = findLCA(root.right, p, q);
        boolean curr = root == p || root == q ;
        
        // if we find two true's , that means we ve find our answer
        if ((left && right) || (left && curr) || (right && curr)) result = root;
        return left || right || curr;
    }
        
}