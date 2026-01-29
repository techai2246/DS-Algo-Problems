package com.techai2246.leetcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * ValidParenthesesProblem - Validates if parentheses, brackets, and braces are correctly matched.
 *
 * Problem Description:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid. An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets
 * 2. Open brackets must be closed in the correct order
 * 3. Every close bracket has a corresponding open bracket of the same type
 *
 * Example:
 * Input: "{[]}"
 * Output: true
 *
 * Input: "{[](}"
 * Output: false
 *
 * Algorithm:
 * - Use Stack data structure to track opening brackets
 * - Push opening characters onto stack
 * - For closing characters, pop from stack and verify match
 * - Stack must be empty at the end for valid string
 *
 * Time Complexity: O(n) where n is string length
 * Space Complexity: O(n) for stack storage
 *
 * @author techai2246
 * @version 1.0
 */
public class ValidParenthesesProblem {

    private final static HashMap<Character, Character> parenthesesMap = new HashMap<>();
    private final static List<Character> openingParentheses = List.of('(', '{', '[');
    private final static List<Character> closingParentheses = List.of(')', '}', ']');

    static {
        parenthesesMap.put(')', '(');
        parenthesesMap.put('}', '{');
        parenthesesMap.put(']', '[');
    }

    public static void main(String[] args) {
        String s = "{[](}";
        ValidParenthesesProblem validParenthesesProblem = new ValidParenthesesProblem();
        boolean result = validParenthesesProblem.isValid(s);
        System.out.println("Is the string \"" + s + "\" valid? " + result);
    }

    /**
     * Validates if a string of parentheses, brackets, and braces is correctly matched.
     *
     * @param s string containing parentheses, brackets, and braces
     * @return true if the string is valid, false otherwise
     */
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i < s.length();i++){
            Character ch = s.charAt(i);
            if(openingParentheses.contains(ch)){
                stack.push(ch);
            } else if(closingParentheses.contains(ch)){
                if(stack.isEmpty() || !stack.pop().equals(parenthesesMap.get(ch))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
