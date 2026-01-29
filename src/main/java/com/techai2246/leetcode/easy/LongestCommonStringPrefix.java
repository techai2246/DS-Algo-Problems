package com.techai2246.leetcode.easy;

/**
 * LongestCommonStringPrefix - Finds the longest common prefix among strings.
 *
 * Problem Description:
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example:
 * Input: strs = ["flower", "flow", "flight"]
 * Output: "fl"
 *
 * Algorithm:
 * - Horizontal scanning approach
 * - Compare characters at each position across all strings
 * - Stop at first mismatch or when any string ends
 *
 * Time Complexity: O(n × m) where n = number of strings, m = prefix length
 * Space Complexity: O(m) for the result StringBuilder
 *
 * @author techai2246
 * @version 1.0
 */
public class LongestCommonStringPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","f","flight"};
        LongestCommonStringPrefix longestCommonStringPrefix = new LongestCommonStringPrefix();
        String result = longestCommonStringPrefix.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }

    /**
     * Finds the longest common prefix among all strings.
     *
     * @param strs array of strings
     * @return longest common prefix or empty string if no common prefix
     */
    private String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i = 0; i< prefix.length();i++){
            for(int j = 0; j< strs.length;j++){
                if(strs[j].length()<=i){
                    return sb.toString();
                }
                if(prefix.charAt(i) != strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(prefix.charAt(i));
        }
        return sb.toString();
    }
}
