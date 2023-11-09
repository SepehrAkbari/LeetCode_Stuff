class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int y = 0;
            int firstX = x;

            while (x > 0) {
                int digit = x % 10;
                y = y * 10 + digit;
                x = x / 10;
            }
            return firstX == y;
        }
    }
}
