package com.techai2246.leetcode.easy;

public class SearchInsertPosition {
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
