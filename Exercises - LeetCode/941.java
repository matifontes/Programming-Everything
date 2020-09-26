class Solution {
    public boolean validMountainArray(int[] A) {
        boolean up = true;
        boolean down = false;
        int countUP = 0;
        int countDOWN = 0;
        if(A.length >= 2 && A[0]>A[1])
            return false;
        if (A.length < 2){
            return false;
        }
        
        for (int i=0; i < A.length-1; i++) {
            if(A[i] > A[i+1] && up){
                up = false;
                down = true;
            }else if(A[i] > A[i+1] && up){
                return false;
            }else if(A[i] <= A[i+1] && !up){
                return false;
            }else if(A[i]==A[i+1]){
                return false;
            }else if(A[i]<A[i+1] && down){
                return false;
            }
        }
        return down;
    }
}
