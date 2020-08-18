class Solution {
    public int hIndex(int[] citations) {
        
        if (citations.length == 0) {
        	return 0;
        }
        
        Arrays.sort(citations);
        
        for (int h = citations.length; h > 0; h--) {
        	int i = citations.length - h;
        	if (citations[i] >= h) {
        		return h;
        	}
        }
        return 0;
    }
}

//0,1,3,5,6
