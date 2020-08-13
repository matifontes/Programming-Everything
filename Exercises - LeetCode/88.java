class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int x = m;
        for (int i= 0; i<n; i++){
            nums1[x] = nums2[i];
            x++;
        }
        
        
        for (int i=0; i<nums1.length-1; i++){
            for(int j=i+1; j<nums1.length;j++){
                if(nums1[i]>=nums1[j]){
                    int aux = nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=aux;
                }
            }
        }
    }
}
