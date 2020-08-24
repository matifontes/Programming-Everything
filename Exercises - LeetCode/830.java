class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList();
        int i = 0;
        int length = s.length(); 
        
        for (int j = 0; j < length; ++j) {
            if (j == length-1 || s.charAt(j) != s.charAt(j+1)) {
                if (j-i+1 >= 3){
                    res.add(Arrays.asList(new Integer[]{i, j})); 
                }
                i = j + 1;
            }
        }

        return res;
    }
}
