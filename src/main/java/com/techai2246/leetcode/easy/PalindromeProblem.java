package com.techai2246.leetcode.easy;

/**
 * PalindromeProblem - Checks if an integer is a palindrome.
 *
 * Problem Description:
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * Example:
 * Input: 121
 * Output: true
 *
 * Input: 123
 * Output: false
 *
 * Approaches:
 * 1. String Reversal: Convert to string and compare with reverse
 * 2. Two Pointer: Use left and right pointers to compare characters
 *
 * Time Complexity: O(n) where n is number of digits
 * Space Complexity: O(n) for string conversion
 *
 * @author techai2246
 * @version 1.0
 */
public class PalindromeProblem {

    /**
     * Checks if a number is a palindrome using string reversal.
     *
     * @param num the number to check
     * @return true if the number is a palindrome, false otherwise
     */
    public boolean isPalindrome(int num){
        String str = String.valueOf(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    /**
     * Checks if a number is a palindrome using two-pointer approach (optimal).
     *
     * @param num the number to check
     * @return true if the number is a palindrome, false otherwise
     */
    public boolean isPalindromeOptimal(int num){
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length() - 1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
            int num = 121;
            PalindromeProblem palindromeProblem = new PalindromeProblem();
            boolean result = palindromeProblem.isPalindrome(num);
            boolean resultOptimal = palindromeProblem.isPalindromeOptimal(num);
            System.out.println("Is " + num + " a palindrome? " + result);
            System.out.println("Is " + num + " a palindrome? " + resultOptimal);
    }
}
