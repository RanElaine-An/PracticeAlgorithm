/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int rev = 0;
        if (x<0) 
        return false;
        while(copy != 0) {
            int pop = copy % 10;
            copy /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE /10) && pop > 7 ) 
            return false;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE /10) && pop < -8) 
            return false;
            rev = rev * 10 + pop;
        }
    return rev == x;   
    }
}
// @lc code=end

