// https://leetcode.com/problems/roman-to-integer/
class Solution {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int num = 0;
        for(int i=0; i<n; i++) {
            if(charArray[i] == 'I' && i+1 < n && charArray[i+1] == 'V') {
                num += 4;
                i++;
                continue;
            }
            if(charArray[i] == 'I' && i+1 < n && charArray[i+1] == 'X') {
                num += 9;
                i++;
                continue;
            }
            if(charArray[i] == 'X' && i+1 < n && charArray[i+1] == 'L') {
                num += 40;
                i++;
                continue;
            }
            if(charArray[i] == 'X' && i+1 < n && charArray[i+1] == 'C') {
                num += 90;
                i++;
                continue;
            }
            if(charArray[i] == 'C' && i+1 < n && charArray[i+1] == 'D') {
                num += 400;
                i++;
                continue;
            }
            if(charArray[i] == 'C' && i+1 < n && charArray[i+1] == 'M') {
                num += 900;
                i++;
                continue;
            }
            if(charArray[i] == 'I') {
                num += 1;
            }
            if(charArray[i] == 'V') {
                num += 5;
            }
            if(charArray[i] == 'X') {
                num += 10;
            }
            if(charArray[i] == 'L') {
                num += 50;
            }
            if(charArray[i] == 'C') {
                num += 100;
            }
            if(charArray[i] == 'D') {
                num += 500;
            }
            if(charArray[i] == 'M') {
                num += 1000;
            }
        }
        return num;
    }
}
