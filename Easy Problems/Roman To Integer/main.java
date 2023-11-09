class Solution {
    public int romanToInt(String s) {
        int n = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                String pair = s.substring(i, i + 2);
                if (pair.equals("IV")) {
                    n += 4;
                    i++;
                } else if (pair.equals("IX")) {
                    n += 9;
                    i++;
                } else if (pair.equals("XL")) {
                    n += 40;
                    i++;
                } else if (pair.equals("XC")) {
                    n += 90;
                    i++;
                } else if (pair.equals("CD")) {
                    n += 400;
                    i++;
                } else if (pair.equals("CM")) {
                    n += 900;
                    i++;
                } else {
                    n += getValue(s.charAt(i));
                }
            } else {
                n += getValue(s.charAt(i));
            }
        }
        return n;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
