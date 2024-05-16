/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode nodeLeft;
 *     TreeNode nodeRight;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode nodeLeft, TreeNode nodeRight) {
 *         this.val = val;
 *         this.nodeLeft = nodeLeft;
 *         this.nodeRight = nodeRight;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }
    private boolean isSymmetricHelp(TreeNode nodeLeft, TreeNode nodeRight){
    if(nodeLeft==null || nodeRight==null)
        return nodeLeft==nodeRight;
    if(nodeLeft.val!=nodeRight.val)
        return false;
    return isSymmetricHelp(nodeLeft.left, nodeRight.right) && isSymmetricHelp(nodeLeft.right, nodeRight.left);
    }
}