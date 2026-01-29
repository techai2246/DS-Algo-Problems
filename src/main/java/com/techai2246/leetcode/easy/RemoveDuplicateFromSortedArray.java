package com.techai2246.leetcode.easy;


/**
 * RemoveDuplicateFromSortedArray - Removes duplicates from a sorted array.
 *
 * Problem Description:
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * Return k after placing the final result in the first k elements of nums.
 *
 * Example:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5
 * Array becomes: [0,1,2,3,4,_,_,_,_,_]
 *
 * Algorithm:
 * - Iterate through array and track unique count
 * - Compare each element with previous element to identify duplicates
 * - Move unique elements forward in the array
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @author techai2246
 * @version 1.0
 */
public class RemoveDuplicateFromSortedArray {

    /**
     * Removes duplicate elements from a sorted array in-place.
     *
     * @param nums sorted array that may contain duplicates
     * @return number of unique elements after removing duplicates
     */
    public int removeDuplicates(int[] nums) {
        int uniqueCount = 0;
        int [] finalArray = new int[nums.length];
        if(nums.length==0){
            return 0;
        }
        finalArray[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                finalArray[++uniqueCount]=nums[i];
            }
        }
        //Re-enrich the array with final Array
        for(int k=0; k<uniqueCount+1; k++){
            nums[k]=finalArray[k];
        }
        return uniqueCount+1;
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicateFromSortedArray.removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: [");
        for(int i=0; i<length; i++){
            System.out.print(nums[i]);
            if(i < length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
