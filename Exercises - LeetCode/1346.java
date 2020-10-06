class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean exist = false;
        
        for (int i = 0; i < arr.length && !exist; i++) {
            for (int j = 0; j < arr.length && !exist; j++) {
                if (arr[i]*2 == arr[j] && i != j) {
                    exist = true;
                }
            }
        }
        return exist;
    }
}
