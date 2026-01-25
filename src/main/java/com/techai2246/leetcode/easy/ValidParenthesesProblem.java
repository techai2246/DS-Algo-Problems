package com.techai2246.leetcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

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
