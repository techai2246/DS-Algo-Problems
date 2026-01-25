package com.techai2246.leetcode.easy;

public class LongestCommonStringPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","f","flight"};
        LongestCommonStringPrefix longestCommonStringPrefix = new LongestCommonStringPrefix();
        String result = longestCommonStringPrefix.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }

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
