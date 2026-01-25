package com.techai2246.leetcode.easy;

public class RemoveElement {
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
