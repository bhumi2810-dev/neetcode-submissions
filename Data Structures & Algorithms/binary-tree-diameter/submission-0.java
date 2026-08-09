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
    int height(TreeNode root){
        if(root==null) return 0;
        int leftH=height(root.left);
        int rightH=height(root.right);
        return 1+Math.max(leftH,rightH);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int leftD=diameterOfBinaryTree(root.left);
        int rightD=diameterOfBinaryTree(root.right);
        int curr=height(root.left)+height(root.right);

        return Math.max(curr,Math.max(leftD,rightD));
    }
}
