package com.techai2246.leetcode.easy;

/**
 * TreeNode - Utility class representing a node in a binary tree.
 *
 * Description:
 * This class provides the fundamental building block for binary tree implementations.
 * Each node contains an integer value and references to left and right child nodes.
 *
 * Fields:
 * - val: The integer value stored in this node
 * - left: Reference to the left child node
 * - right: Reference to the right child node
 *
 * Constructors:
 * - TreeNode(): Default constructor for empty node
 * - TreeNode(int val): Constructor with value initialization
 * - TreeNode(int val, TreeNode left, TreeNode right): Constructor with value and child references
 *
 * Usage:
 * TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
 *
 * @author techai2246
 * @version 1.0
 */
public class TreeNode {
    /** The integer value stored in this node */
    int val;
    /** Reference to the left child node */
    TreeNode left;
    /** Reference to the right child node */
    TreeNode right;

    /**
     * Default constructor for creating an empty TreeNode.
     */
    TreeNode() {
    }

    /**
     * Constructor for creating a TreeNode with a specified value.
     *
     * @param val the integer value to store in this node
     */
    TreeNode(int val) {
        this.val = val;
    }

    /**
     * Constructor for creating a TreeNode with value and child node references.
     *
     * @param val the integer value to store in this node
     * @param left the left child node
     * @param right the right child node
     */
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
