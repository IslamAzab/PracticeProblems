import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[] { i, map.get(diff) };
            }
        }

        return null;
    }

   public static void main(String[] args) {
        System.out.println(
            Arrays.toString(
                new Solution2().twoSum(new int[] {3,0,3}, 6)
            )
        );
   }
}
