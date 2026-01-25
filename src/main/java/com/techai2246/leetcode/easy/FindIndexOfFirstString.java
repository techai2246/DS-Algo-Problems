package com.techai2246.leetcode.easy;

public class FindIndexOfFirstString {
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
