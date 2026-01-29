package com.techai2246.leetcode.easy;

/**
 * SquareRootOfNumber - Computes the integer square root using Newton's Theorem.
 *
 * Problem Description:
 * Given a non-negative integer x, compute and return the square root of x.
 * Since the return type is an integer, the decimal digits are truncated,
 * and only the integer part of the result is returned.
 *
 * Example:
 * Input: 8
 * Output: 2
 *
 * Input: 4
 * Output: 2
 *
 * Algorithm:
 * - Use Newton's iterative method for square root approximation
 * - Refine approximation through recursive calls
 * - Return integer floor of square root after convergence
 * - Formula: next_approx = (approx + num/approx) / 2
 *
 * Time Complexity: O(log n) with 30 iterations
 * Space Complexity: O(1) amortized for recursion
 *
 * @author techai2246
 * @version 1.0
 */
public class SquareRootOfNumber {
    /**
     * Computes the integer square root using Newton's Theorem.
     *
     * @param x non-negative integer
     * @return integer square root (floor value)
     */
    public int mySqrt(int x) {
        return (x==0||x==1)? x: newtonTheorem(x/2, x,0,0);
    }

    /**
     * Helper method using Newton's iterative method for square root approximation.
     * Converges to the square root through recursive refinement.
     *
     * @param approximate current approximation
     * @param num original number to find square root of
     * @param count iteration count (stops after 30 iterations)
     * @param result current approximation result
     * @return integer square root
     */
    private int newtonTheorem(int approximate, int num, int count, int result){
        if(count == 30){
            if ((long) result * result > num) {
                result--;
            }
            return result;
        }
        result = (approximate + (num / approximate)) / 2;
        return newtonTheorem(result, num, count + 1, result);
    }

    public static void main(String[] args) {
        SquareRootOfNumber squareRootOfNumber = new SquareRootOfNumber();
        int x = 24;
        int result = squareRootOfNumber.mySqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
    }
}
