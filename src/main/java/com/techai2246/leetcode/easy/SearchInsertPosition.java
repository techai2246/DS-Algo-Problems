package com.techai2246.leetcode.easy;

/**
 * SearchInsertPosition - Finds the position to insert a target value in a sorted array.
 *
 * Problem Description:
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * Example:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * Algorithm:
 * - Use optimized linear search with boundary checks
 * - Compare target with mid point to partition search space
 * - Find exact position or insertion point
 *
 * Time Complexity: O(n) in worst case (can be optimized to O(log n) with binary search)
 * Space Complexity: O(1)
 *
 * @author techai2246
 * @version 1.0
 */
public class SearchInsertPosition {
    /**
     * Finds the index where a target value should be inserted in a sorted array.
     *
     * @param nums sorted array of distinct integers
     * @param target value to search for or insert
     * @return index if found, or index where it should be inserted
     */
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        int mid = nums.length/2;
        int startArray = target>nums[mid]? mid:0;
        int endArray = startArray==0?mid:nums.length-1;
        //Boundary condition checks -1 where target is equivalent to or less than first element or greater than last element
        if(target<=nums[startArray]){
            return startArray;
        }
        //Boundary condition checks -2 where target is greater than last element
        if(target>nums[endArray]){
            return endArray+1;
        }
        for(int i=startArray ; i<=endArray; i++){
            if(nums[i]==target){
                position=i;
                break;
            }else {
                if(nums[i]<target && nums[i+1]>target){
                    position=i+1;
                    break;
                }
            }
        }
        return position;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1};
        int target = 6;
        int position = searchInsertPosition.searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + position);
    }
}
