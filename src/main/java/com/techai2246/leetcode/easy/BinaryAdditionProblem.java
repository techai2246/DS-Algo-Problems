package com.techai2246.leetcode.easy;

/**
 * BinaryAdditionProblem - Adds two binary numbers represented as strings.
 *
 * Problem Description:
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example:
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Algorithm:
 * - Process both strings from right to left
 * - Add corresponding bits and handle carry propagation
 * - Build result string in reverse order
 *
 * Time Complexity: O(max(len(a), len(b)))
 * Space Complexity: O(max(len(a), len(b))) for the result string
 *
 * @author techai2246
 * @version 1.0
 */
public class BinaryAdditionProblem {
    /**
     * Adds two binary numbers represented as strings.
     *
     * @param a first binary string
     * @param b second binary string
     * @return sum of two binary numbers as a string
     */
    public String addBinary(String a, String b) {
        int firstStringLength=a.length();
        int secondStringLength=b.length();
        StringBuilder result = new StringBuilder();
        int carry=0;
        int i=firstStringLength-1;
        int j=secondStringLength-1;
        while(i>=0 || j>=0){
            int sum=0;
            if(i>=0){
                sum+= Integer.parseInt(String.valueOf(a.charAt(i)))+carry;
                carry=0;
                i--;
            }
            if(j>=0){
                sum+= Integer.parseInt(String.valueOf(b.charAt(j)))+carry;
                j--;
            }
            result.append(sum%2);
            carry = sum/2;
        }
        if(carry !=0){
            result.append(carry);
        }
        return result.reverse().toString();
    }


    public static void main(String[] args) {
        BinaryAdditionProblem binaryAdditionProblem = new BinaryAdditionProblem();
        String a = "1";
        String b = "1";
        String result = binaryAdditionProblem.addBinary(a, b);
        System.out.println("Sum of binary strings " + a + " and " + b + " is: " + result);
    }
}
