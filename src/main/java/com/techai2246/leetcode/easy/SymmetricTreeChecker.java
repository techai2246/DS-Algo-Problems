package com.techai2246.leetcode.easy;

/**
 * SymmetricTreeChecker - Checks if a binary tree is symmetric (mirror image).
 *
 * Problem Description:
 * Given the root of a binary tree, check whether it is a mirror of itself
 * (i.e., symmetric around its center). A binary tree is symmetric if the left
 * subtree is a mirror reflection of the right subtree.
 *
 * Example:
 * Tree:           1
 *               /   \
 *              2     2
 *             / \   / \
 *            3   4 4   3
 * Output: true
 *
 * Non-symmetric:  1
 *               /   \
 *              2     2
 *               \     \
 *                3     3
 * Output: false
 *
 * Algorithm:
 * - Recursively compare left and right subtrees simultaneously
 * - For symmetry: left.left mirrors right.right and left.right mirrors right.left
 * - Base case: both nodes are null (symmetric)
 * - Check if node values match and subtrees are symmetric
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(h) where h is the height (recursion stack)
 *
 * @author techai2246
 * @version 1.0
 */
public class SymmetricTreeChecker {
    /**
     * Checks if a binary tree is symmetric.
     *
     * @param root the root node of the binary tree
     * @return true if the tree is symmetric, false otherwise
     */
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricChecker(root.left, root.right);
    }

    /**
     * Helper method to recursively check if two subtrees are symmetric mirrors of each other.
     * For trees to be symmetric: left.left must mirror right.right and left.right must mirror right.left.
     *
     * @param left the left subtree node
     * @param right the right subtree node
     * @return true if the two subtrees are symmetric, false otherwise
     */
    public boolean isSymmetricChecker(TreeNode left, TreeNode right){
        if(left==null && right == null){
            return true;
        }
        if((left!= null && right==null)||(left== null && right!=null)){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return isSymmetricChecker(left.left, right.right) && isSymmetricChecker(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        SymmetricTreeChecker checker = new SymmetricTreeChecker();
        boolean result = checker.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result);
    }
}

