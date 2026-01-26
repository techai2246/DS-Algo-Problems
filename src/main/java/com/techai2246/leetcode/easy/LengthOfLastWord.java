package com.techai2246.leetcode.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.trim().isEmpty()){
            return 0;
        }
        String postRemovalLeadingSpace= removeLeadingWhiteSpaces(s);
        String [] str = postRemovalLeadingSpace.trim().split(" ");
        return str[str.length-1].length();
    }
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

    /** Optimal Solution */
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
