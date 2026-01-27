package com.techai2246.leetcode.easy;

public class PlusOneProblem {
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
