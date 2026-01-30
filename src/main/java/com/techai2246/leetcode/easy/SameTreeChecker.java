package com.techai2246.leetcode.easy;

/**
 * SameTreeChecker - Checks if two binary trees are identical.
 *
 * Problem Description:
 * Given the roots of two binary trees p and q, write a function to check
 * if they are the same or not. Two binary trees are considered the same
 * if they are structurally identical and the nodes have the same values.
 *
 * Example:
 * Tree1:      1          Tree2:      1
 *            / \                    / \
 *           2   3                  2   3
 * Output: true
 *
 * Algorithm:
 * - Use recursive approach to compare both trees simultaneously
 * - Base case: both nodes are null (identical subtrees)
 * - Check if one node is null and other isn't (different)
 * - Check if node values match
 * - Recursively check left and right subtrees
 *
 * Time Complexity: O(n) where n is minimum number of nodes in both trees
 * Space Complexity: O(h) where h is height due to recursion stack
 *
 * @author techai2246
 * @version 1.0
 */
public class SameTreeChecker {
    /**
     * Checks if two binary trees are identical.
     *
     * @param p root of the first binary tree
     * @param q root of the second binary tree
     * @return true if both trees are identical, false otherwise
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return isSameChecker(p, q);

    }

    /**
     * Helper method to recursively compare two binary trees.
     * Checks both structure and node values.
     *
     * @param first root of the first tree to compare
     * @param second root of the second tree to compare
     * @return true if both subtrees are identical, false otherwise
     */
    private boolean isSameChecker(TreeNode first, TreeNode second){
        boolean isSame= true;
        if(first == null && second == null){
            return isSame;
        }
        if((first!=null && second==null)||(first==null && second!=null)){
            isSame=false;
        }
        if(first!=null && second!=null){
            if(first.val != second.val){
                isSame=false;
            }
        }
        return isSame && isSameChecker(first.left, second.left) && isSameChecker(first.right, second.right);

    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        SameTreeChecker checker = new SameTreeChecker();
        boolean result = checker.isSameTree(p, q);
        System.out.println("Are the two trees the same? " + result);
    }
}
