// https://leetcode.com/problems/roman-to-integer/
class Solution2 { 
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int[] nums = new int[n];
        for (int i=0; i<n ; i++) {
            char c = charArray[i];
            switch (c) {
                case 'M':
                    nums[i] = 1000;
                break;
                case 'D':
                    nums[i] = 500;
                break;
                case 'C':
                    nums[i] = 100;
                break;
                case 'L':
                    nums[i] = 50;
                break;
                case 'X':
                    nums[i] = 10;
                break;
                case 'V':
                    nums[i] = 5;
                break;
                case 'I':
                    nums[i] = 1;
                break;
            }
        }

        int sum = 0;
        for (int i=0; i<n-1 ; i++) {
            if (nums[i]<nums[i+1]) {
                sum -= nums[i];
            }
            if (nums[i]>nums[i+1]) {
                sum += nums[i];
            }
        }
        return sum + nums[n-1];
  }
}
