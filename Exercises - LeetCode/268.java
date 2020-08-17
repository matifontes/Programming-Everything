class Solution {
    public int missingNumber(int[] nums) {
        boolean missing = false;
        int missingNum =0;
        
        if(nums.length == 1 && nums[0] == 0){
            missingNum = 1;
        }else{
            for (int i=0; i<=nums.length && !missing ;i++){
                boolean aux= false;
                for (int j=0; j<nums.length && !missing; j++){
                    if(i==nums[j]){
                        aux = true;
                    }
                }
                if(!aux){
                    missing = true;
                    missingNum = i;
                }
            }

        }
        
        return missingNum;
    }
}
