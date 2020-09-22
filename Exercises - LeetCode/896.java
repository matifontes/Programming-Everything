class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = true;
        boolean dec = true;
        
        for(int i=0; i<A.length-1 && inc; i++){
            if(A[i]>A[i+1]){
                inc = false;
                }  
        }
        
        for(int i=0; i<A.length-1 && dec; i++){
            if(A[i]<A[i+1]){
                dec = false;
            }
        }
        
        return (dec||inc);
    }
}
