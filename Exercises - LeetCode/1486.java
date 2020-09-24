class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        int aux = start;
        for (int i = 0; i < n; i++) {
            res ^= curr;
            aux += 2;
        }
        return res;
    }
}
