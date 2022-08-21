/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
*/

class Solution {
    public int addDigits(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num = num / 10;
            if (num == 0 && res > 9) {
                num = res;
                res = 0;
            }
        }
        return res;
    }
}
