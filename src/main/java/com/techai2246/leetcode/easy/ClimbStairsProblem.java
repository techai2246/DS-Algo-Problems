package com.techai2246.leetcode.easy;

/**
 * ClimbStairsProblem - Counts the number of ways to climb n stairs.
 *
 * Problem Description:
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 *
 * Example:
 * Input: n = 3
 * Output: 3
 * Explanation: 1+1+1, 1+2, 2+1
 *
 * Algorithm:
 * - Use dynamic programming with bottom-up approach
 * - For each stair i, ways[i] = ways[i-1] + ways[i-2]
 * - This follows the Fibonacci sequence pattern
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @author techai2246
 * @version 1.0
 */
public class ClimbStairsProblem {
    /**
     * Counts the number of ways to climb n stairs.
     * You can climb 1 or 2 steps at a time.
     *
     * @param n number of stairs to climb
     * @return number of distinct ways to reach the top
     */
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] ways = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }

    public static void main(String[] args) {
        ClimbStairsProblem climbStairsProblem = new ClimbStairsProblem();
        int n = 3;
        int result = climbStairsProblem.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}
