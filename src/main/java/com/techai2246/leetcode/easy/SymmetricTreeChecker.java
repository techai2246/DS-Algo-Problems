package com.techai2246.leetcode.easy;

public class SymmetricTreeChecker {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricChecker(root.left, root.right);
    }

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

