class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.size() == 0) {
            return 0;
        }
        int ret = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] != nums[ret]) {
                ret++;
                nums[ret] = nums[i];
            }
        }
        return ret + 1;
    }
};
