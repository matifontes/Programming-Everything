class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] aux = new int[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            aux[nums[i]]++;
        }
        
        
        List<Integer> res = new ArrayList<>();
        
        for (int i=1;i<aux.length; i++){
            if(aux[i]==0){
                res.add(i);
            }
        }
        
        return res;
    }
}
