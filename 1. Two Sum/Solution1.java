// https://leetcode.com/problems/two-sum/
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] valueDiff = new int[n];

        for(int i=0; i<n; i++) {
            valueDiff[i] = target - nums[i];
        }

        for(int i=0; i<n; i++) {
            int diff = target - nums[i];
            for(int j=i+1; j<n; j++){
                if(target == diff + valueDiff[j]) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {0, 1};
    }
}

