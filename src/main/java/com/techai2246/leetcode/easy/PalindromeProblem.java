package com.techai2246.leetcode.easy;

public class PalindromeProblem {

    public boolean isPalindrome(int num){
        String str = String.valueOf(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

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
