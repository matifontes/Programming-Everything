class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        for(int i=0; i+k<=nums.length;i++){
            double promedio = 0;
            int suma = 0;
            int aux=k;
            for (int j=i; aux>0;j++){
                suma = suma + nums[j]; 
                aux--;
            }
            promedio = (double)suma/k;
            if(promedio>max){
                max=promedio;
            }
            
        }
        return max;
    }
}
