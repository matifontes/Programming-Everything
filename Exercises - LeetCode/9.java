class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10 == 0 && x!=0)){
            return false;
        }
        int aux = 0;
        while (x > aux){
            aux = aux * 10 + x % 10;
            x = x/10;
        }
        return x==aux || x == aux/10;
    }
}
