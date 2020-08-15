class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] res = new int [2];
        boolean encontrado = false;
        for (int i=0; i<numbers.length-1 && !encontrado ;i++){
            for(int j=i+1; j<numbers.length && !encontrado;j++){
                if(numbers[i]+numbers[j] == target){
                    res[0]=i+1;
                    res[1]=j+1;
                    encontrado =true;
                }
            }
        }
        return res;
    }
}
