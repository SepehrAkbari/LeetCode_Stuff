class Solution {
    public int countHomogenous(String s) {
        int MOD = 1_000_000_007;
        long count = 0;
        long length = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                length++;
            } else {
                count = (count + (length * (length + 1) / 2) % MOD) % MOD;
                length = 1;
            }
        }
        count = (count + (length * (length + 1) / 2) % MOD) % MOD;
        return (int) count;
    }
}
