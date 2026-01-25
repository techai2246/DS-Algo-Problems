package com.techai2246.leetcode.easy;

import java.util.ArrayList;

public class Solution2SumProblem {
    //Bruteforce Approach complexity would order of nˆ2
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

    //Optimal Approach complexity would order of n
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
