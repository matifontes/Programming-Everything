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





//Leetcode solution
/*

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        // Ensure that n is at the last index
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }

        // If we get here, then the missing number is on the range (0, n)
        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i-1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }

        // Array was not missing any numbers
        return -1;
    }
}

*/
