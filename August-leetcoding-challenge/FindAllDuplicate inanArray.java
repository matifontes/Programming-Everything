// O(n)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] aux = new int[nums.length+1];
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            aux[nums[i]]++;
        }
        
        for(int i=1; i<aux.length;i++){
            if(aux[i]>1){
                res.add(i);
            }
        }
        return res;   
    }
}
