class Solution {
    public double average(int[] salary) {
        double res = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i < salary.length; i++) {
            if(salary[i] < min){
                min = salary[i];
            }
            
            if(salary[i] > max){
                max=salary[i];
            }
        }
        
        double sum = 0;
        double count = 0;
        for(int i=0; i < salary.length; i++) {
            if(salary[i] != max && salary[i] != min){
                count++;
                sum += salary[i];
            }
        }
        res = sum / count;
        return res;
    }
}
