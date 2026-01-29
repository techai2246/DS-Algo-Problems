package com.techai2246.leetcode.easy;

import java.util.ArrayList;

/**
 * Solution2SumProblem - Finds two numbers that add up to a target sum.
 *
 * Problem Description:
 * Given an array of integers nums and an integer target,
 * return the indices of the two numbers such that they add up to target.
 * You may assume that each input has exactly one solution,
 * and you may not use the same element twice.
 *
 * Example:
 * Input: nums = [2, 4, 11, 3], target = 6
 * Output: [0, 1]
 * Explanation: nums[0] + nums[1] = 2 + 4 = 6
 *
 * Approaches:
 * 1. Brute Force: Nested loop comparing all pairs → O(n²) time, O(1) space
 * 2. Optimal: Using ArrayList for complement lookup → O(n) time, O(n) space
 *
 * Time Complexity: O(n) for optimal approach
 * Space Complexity: O(n) for ArrayList
 *
 * @author techai2246
 * @version 1.0
 */
public class Solution2SumProblem {
    /**
     * Finds two numbers that add up to target using brute force approach.
     *
     * @param nums array of integers
     * @param target sum to find
     * @return indices of two numbers that add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        int result[]= new int[2];
        for(int i=0; i<=nums.length-2;i++){
            for(int j = i+1; j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }

        }

        return result;
    }

    /**
     * Finds two numbers that add up to target using optimal ArrayList approach.
     *
     * @param nums array of integers
     * @param target sum to find
     * @return indices of two numbers that add up to target
     */
    public int[] twoSumOptimal(int[] nums, int target){
        int[] result = new int[2];
        ArrayList<Integer> integerList = new ArrayList<>();
        for(int element: nums){
            integerList.add(element);
        }
        for(int i=0;i<=integerList.size();i++){
            int element = integerList.get(i);
            int complement = target - element;
            if(integerList.contains(complement) && (i!=integerList.indexOf(complement))){
                result[1]=integerList.indexOf(element);
                result[0]=integerList.lastIndexOf(complement);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2SumProblem solution = new Solution2SumProblem();
        int[] nums = {50000000,3,2,4,50000000};
        int target = 100000000;
        int[] result = solution.twoSum(nums, target);
        int[] resultOptimal = solution.twoSumOptimal(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        System.out.println("[" + resultOptimal[0] + ", " + resultOptimal[1] + "]");
    }
}
