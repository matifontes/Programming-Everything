class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int length = A.length;
        int curr = K;
        List<Integer> res = new ArrayList();

        int i = length;
        while (--i >= 0 || curr > 0) {
            if (i >= 0)
                curr += A[i];
            res.add(curr % 10);
            curr /= 10;
        }

        Collections.reverse(res);
        return res;
    }
}
