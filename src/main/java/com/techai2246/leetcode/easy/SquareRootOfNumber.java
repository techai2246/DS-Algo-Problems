package com.techai2246.leetcode.easy;

public class SquareRootOfNumber {
    public int mySqrt(int x) {
        return (x==0||x==1)? x: newtonTheorem(x/2, x,0,0);
    }

    private int newtonTheorem(int approximate, int num, int count, int result){
        if(count == 30){
            if ((long) result * result > num) {
                result--;
            }
            return result;
        }
        result = (approximate + (num / approximate)) / 2;
        return newtonTheorem(result, num, count + 1, result);
    }

    public static void main(String[] args) {
        SquareRootOfNumber squareRootOfNumber = new SquareRootOfNumber();
        int x = 24;
        int result = squareRootOfNumber.mySqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
    }
}
