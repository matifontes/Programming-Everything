class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean stop = false;
        int[] res = new int[2];
        
        for (int i = 0; i < nums.length && !stop; i++) {
            for (int j = 0; j < nums.length && !stop; j++) {
                if (j != i && nums[i] + nums[j] == target ) {
                    stop = true;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
