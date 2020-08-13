class Solution {
    public int majorityElement(int[] nums) {
        int majority=0;
        int aux = nums.length / 2;

        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for(int j = i+1; j<nums.length; j++){
                if (nums[i] == nums [j]){
                    count ++;
                }
            }
            if (count >= aux){
                majority = nums[i];
                i=nums.length;
            }
        }
        return majority;
    }
}
