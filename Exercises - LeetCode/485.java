class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        boolean isOne = true;
        int count = 0;
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }
            
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}
