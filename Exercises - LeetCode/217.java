//Time Limit Exceeded

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        for(int i=0; i<nums.length-1 && !duplicate;i++){
            for(int j=i+1; j<nums.length && !duplicate;j++){
                if(nums[i] == nums[j]){
                    duplicate = true;
                }
            }
        }
        return duplicate;
    }
}
