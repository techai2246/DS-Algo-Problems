package com.techai2246.leetcode.easy;

/**
 * FindIndexOfFirstString - Finds the first occurrence of a substring in a string.
 *
 * Problem Description:
 * Given two strings haystack and needle, return the index of the first occurrence
 * of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Algorithm:
 * - Iterate through the haystack string
 * - At each position, check if the substring matches
 * - Return the index of first match or -1 if not found
 *
 * Time Complexity: O(n × m) where n = haystack length, m = needle length
 * Space Complexity: O(1)
 *
 * @author techai2246
 * @version 1.0
 */
public class FindIndexOfFirstString {
    /**
     * Finds the first occurrence of a substring in a string.
     *
     * @param haystack the string to search in
     * @param needle the substring to search for
     * @return index of first occurrence or -1 if not found
     */
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        char ch = needle.charAt(0);
        int haystackLength=haystack.length();
        if(haystackLength<needleLength){
            return -1;
        }
        for(int i=0;i<haystackLength;i++){
            if(haystack.charAt(i)==ch){
                if(haystackLength !=1 && ((i+needleLength)>haystackLength)){
                    return -1;
                }
                if((haystack.substring(i, i+needleLength).equals(needle))){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindIndexOfFirstString findIndexOfFirstString = new FindIndexOfFirstString();
        String haystack = "bcda";
        String needle = "a";
        int index = findIndexOfFirstString.strStr(haystack, needle);
        System.out.println("Index of first occurrence of \"" + needle + "\" in \"" + haystack + "\": " + index);
    }
}
