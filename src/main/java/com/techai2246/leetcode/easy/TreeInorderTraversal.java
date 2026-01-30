package com.techai2246.leetcode.easy;

import java.util.List;

/**
 * TreeInorderTraversal - Performs inorder traversal of a binary tree.
 *
 * Problem Description:
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * Inorder traversal visits nodes in the order: Left → Node → Right
 *
 * Example:
 * Tree:       1
 *              \
 *               2
 *              /
 *             3
 * Output: [1, 3, 2]
 *
 * Algorithm:
 * - Recursively traverse the left subtree
 * - Process the current node (add to result list)
 * - Recursively traverse the right subtree
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(h) where h is the height (recursion stack)
 *
 * @author techai2246
 * @version 1.0
 */
public class TreeInorderTraversal {
    /**
     * Performs inorder traversal of a binary tree.
     * Returns a list containing nodes visited in inorder sequence: Left → Node → Right
     *
     * @param root the root node of the binary tree
     * @return list of integers representing inorder traversal of the tree
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new java.util.ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    /**
     * Helper method to recursively perform inorder traversal.
     * Adds node values to the result list in inorder sequence.
     *
     * @param node current node being visited
     * @param result list to accumulate the traversal result
     */
    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }

    public static void main(String[] args) {
        // You can add test cases here to test the inorderTraversal method
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        TreeInorderTraversal treeInorderTraversal = new TreeInorderTraversal();
        List<Integer> result = treeInorderTraversal.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result);
    }
}
