package com.techai2246.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * RomanToInteger - Converts a Roman numeral string to an integer.
 *
 * Problem Description:
 * Given a string containing Roman numerals, convert it to an integer.
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol Values:
 * I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
 *
 * Example:
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90, IV = 4; Total = 1994
 *
 * Algorithm:
 * - Map Roman characters to integer values using HashMap
 * - Handle special cases where smaller value precedes larger value (IV, IX, XL, XC, CD, CM)
 * - Sum values with special case adjustments
 *
 * Time Complexity: O(n) where n is length of Roman string
 * Space Complexity: O(1) constant space for maps
 *
 * @author techai2246
 * @version 1.0
 */
public class RomanToInteger {
    private static final HashMap<Character, Integer> romanToIntValueMap = new LinkedHashMap<Character, Integer>();
    private static final HashMap<Character, List<Character>> specialMap = new HashMap<Character, List<Character>>();

    static{
        romanToIntValueMap.put('I',1);
        romanToIntValueMap.put('V',5);
        romanToIntValueMap.put('X',10);
        romanToIntValueMap.put('L',50);
        romanToIntValueMap.put('C',100);
        romanToIntValueMap.put('D',500);
        romanToIntValueMap.put('M',1000);

        //enrich special Map
        List<Character> iList = new ArrayList<Character>();
        iList.add('V');
        iList.add('X');
        List<Character> xList = new ArrayList<Character>();
        xList.add('L');
        xList.add('C');
        List<Character> cList = new ArrayList<Character>();
        cList.add('D');
        cList.add('M');
        specialMap.put('I',iList);
        specialMap.put('X',xList);
        specialMap.put('C',cList);

    }

    /**
     * Converts a Roman numeral string to an integer.
     *
     * @param s Roman numeral string
     * @return integer representation of the Roman numeral
     */
    public int romanToInt(String s) {
        int value = 0;
        boolean isSpecialCase= false;
        for(int i=0; i<s.length();i++){
            Character character = s.charAt(i);
            int mappedValue;
            if (isSpecialCase){
                mappedValue = checkSpecialCase(character);
                isSpecialCase = false;
            } else{
                mappedValue = romanToIntValueMap.get(character);
            }
            value+=mappedValue;
            if(i+1<s.length() && specialMap.containsKey(character)){
                if(specialMap.get(character).contains(s.charAt(i+1))) {
                    isSpecialCase = true;
                }
            }
        }
        return value;
    }

    /**
     * Helper method to handle special case Roman numerals where smaller value precedes larger value.
     * For example, IV = 4 (not 5+1), IX = 9 (not 10+1), etc.
     *
     * @param ch Roman character to convert in special case
     * @return adjusted integer value for the special case
     */
    private int checkSpecialCase(char ch){
        return switch (ch) {
            case 'V' -> 3;
            case 'L' -> 30;
            case 'X' -> 8;
            case 'C' -> 80;
            case 'D' -> 300;
            case 'M' -> 800;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String romanStr = "MCMXCIV";
        int result = romanToInteger.romanToInt(romanStr);
        System.out.println("The integer value of Roman numeral " + romanStr + " is: " + result);
    }
}
