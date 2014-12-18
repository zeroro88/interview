package com.interview;

/**
 * Created_By: stefanie
 * Date: 14-12-17
 * Time: 上午8:30
 */
public class Solution {

    public static int max = Integer.MAX_VALUE/10;
    public boolean isPalindrome(int x) {
        x = Math.abs(x);
        int rev = reverse(x);
        return rev == x;
    }

    public int reverse(int x){
        int rev = 0;
        while(x > 0){
            if(rev > max) return 0;
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        boolean isP = solution.isPalindrome(-2147447412);
        System.out.println(isP);
    }
}
