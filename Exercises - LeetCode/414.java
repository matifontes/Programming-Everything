public class Solution {
    public int thirdMax(int[] nums) {
        int count = 0;
        long[] res = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > res[0]) {
                res[2] = res[1];
                res[1] = res[0];
                res[0] = nums[i];
                count++;
            } else if (nums[i] > res[1] && nums[i] < res[0]) {
                res[2] = res[1];
                res[1] = nums[i];
                count++;
            } else if (nums[i] > res[2] && nums[i] < res[1]) {
                res[2] = nums[i];
                count++;
            }
        }
        if (count>2){ //si hay mas de 2 entradas distintas.
            return (int)res[2];
        }else{
            return (int)res[0];
        }
    }
}
