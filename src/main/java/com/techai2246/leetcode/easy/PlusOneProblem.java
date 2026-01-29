package com.techai2246.leetcode.easy;

/**
 * PlusOneProblem - Adds one to a number represented as an array of digits.
 *
 * Problem Description:
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Example:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 *
 * Input: digits = [9,9,9]
 * Output: [1,0,0,0]
 *
 * Algorithm:
 * - Add 1 to the last digit
 * - Handle carry propagation from right to left
 * - Expand array if necessary (when all digits are 9)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @author techai2246
 * @version 1.0
 */
public class PlusOneProblem {
    /**
     * Adds one to a number represented as an array of digits.
     *
     * @param digits array representing digits of the number
     * @return array with result of adding one
     */
    public int[] plusOne(int[] digits) {
        int originalArrayLength = digits.length;
        int [] finalIntegerArray = new int[originalArrayLength+1];
        int carry=0, k=originalArrayLength-1;
        while(k>=0){
            if(k==originalArrayLength-1){
                digits[k]=digits[k]+1;
            }
            int remainder = (digits[k]+carry)%10;
            int dividend = (digits[k]+carry)/10;
            carry=0;
            finalIntegerArray[k+1]=remainder;
            if( dividend != 0 && remainder == 0){
                carry=1;
            }
            k--;
        }
        if(carry != 0){
            finalIntegerArray[0] = carry;
        } else{
            int [] tempArray = new int[originalArrayLength];
            for(int i=0; i<originalArrayLength; i++){
                tempArray[i]=finalIntegerArray[i+1];
            }
            finalIntegerArray = tempArray;
        }
        return finalIntegerArray;
    }
    public static void main(String[] args) {
        PlusOneProblem plusOneProblem = new PlusOneProblem();
        int[] digits = {1,0,0,0,0};
        int[] result = plusOneProblem.plusOne(digits);
        System.out.print("Result after adding one: [");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
            if(i < result.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
