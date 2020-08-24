class Solution {
    public int pivotIndex(int[] nums) {
        int index = -1;
        for(int i=0; i<nums.length;i++){
            int sumR = 0;
            int sumL = 0;
            for(int j=i+1; j<nums.length; j++){
                sumR += nums[j]; 
            }
            for(int x= i-1; x>=0; x--){
                sumL += nums[x];
            }
            
            if(sumR==sumL){
                index= i;
                return index;
            }
        }
        return index;
    }
}
