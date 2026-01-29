package com.techai2246.leetcode.easy;

/**
 * LengthOfLastWord - Finds the length of the last word in a string.
 *
 * Problem Description:
 * Given a string s consisting of words and spaces, return the length of
 * the last word in the string. A word is a maximal substring consisting
 * of non-space characters only.
 *
 * Example:
 * Input: "   fly me   to   the moon  "
 * Output: 4 (length of "moon")
 *
 * Approaches:
 * 1. Split Method: Split by spaces and get last word
 * 2. Optimal: Iterate from end backwards, count non-space characters
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) for optimal approach
 *
 * @author techai2246
 * @version 1.0
 */
public class LengthOfLastWord {
    /**
     * Finds the length of the last word in a string.
     * A word is defined as a maximal substring of non-space characters.
     *
     * @param s the input string
     * @return length of the last word
     */
    public int lengthOfLastWord(String s) {
        if(s.trim().isEmpty()){
            return 0;
        }
        String postRemovalLeadingSpace= removeLeadingWhiteSpaces(s);
        String [] str = postRemovalLeadingSpace.trim().split(" ");
        return str[str.length-1].length();
    }

    /**
     * Helper method to remove leading whitespace from a string.
     *
     * @param str the input string
     * @return string with leading spaces removed
     */
    private String removeLeadingWhiteSpaces(String str){
        int count =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) != ' '|| (i==str.length()-1)){
                return str.substring(count);
            }
            count++;
        }
        return str;
    }

    /**
     * Optimal approach to find the length of the last word.
     * Iterates from end of string backwards, counting non-space characters.
     * More space-efficient than split method.
     *
     * @param s the input string
     * @return length of the last word
     */
    public int lengthOfLastWordOptimally(String s) {
        String str = s.trim();
        int countCharacterInLastWord = 0;
        int k = str.length()-1;
        while(k>=0){
            if(str.charAt(k) == ' ') break;
            countCharacterInLastWord++;
            k--;
        }
        return countCharacterInLastWord;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String s = "   fly me   to   the moon  ";
        int length = lengthOfLastWord.lengthOfLastWord(s);
        int optimalLength = lengthOfLastWord.lengthOfLastWordOptimally(s);
        System.out.println("Length of last word in the string (Initial Method): " + length);
        System.out.println("Length of last word in the string (Optimal Method): " + optimalLength);
    }
}
