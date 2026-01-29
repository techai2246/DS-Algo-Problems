package com.techai2246.leetcode.easy;

/**
 * RemoveElement - Removes all occurrences of a value from an array.
 *
 * Problem Description:
 * Given an integer array nums and an integer val, remove all occurrences of val in nums
 * in-place. The relative order of the elements may be changed.
 * Return the number of elements in nums which are not equal to val.
 *
 * Example:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2
 * Array becomes: [2,2,_,_]
 *
 * Algorithm:
 * - Iterate through the array
 * - Collect all non-matching elements in temporary array
 * - Rearrange elements in-place
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @author techai2246
 * @version 1.0
 */
public class RemoveElement {
    /**
     * Removes all occurrences of a specific value from an array in-place.
     *
     * @param nums array to modify
     * @param val value to remove
     * @return number of elements in nums which are not equal to val
     */
    public int removeElement(int[] nums, int val) {
        int removedElement=0;
        int [] finalArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                finalArray[removedElement]=nums[i];
                removedElement++;
            }
        }

        for(int k =0; k<removedElement;k++){
            nums[k]=finalArray[k];
        }
        return removedElement;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3,2,2,3};
        int val = 3;
        int length = removeElement.removeElement(nums, val);
        System.out.println("Length of array after removing element " + val + ": " + length);
        System.out.print("Array after removing element " + val + ": [");
        for(int i=0; i<length; i++){
            System.out.print(nums[i]);
            if(i < length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
