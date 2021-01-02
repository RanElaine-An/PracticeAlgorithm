import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* 
        //Brute force method 
        //time complexity=O(n2) space complexity=O(1)
        
        for(int i=0; i<nums.length; i++) {
            for(int j= i+1; j<nums.length;j++) {
                if(nums[j] == target-nums[i]) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no target");
        */
        
        //Two pass Hashmap
        /* Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
          map.put(nums[i], i);  
        }
        for(int i = 0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff) && map.get(diff) != i) {
                return new int[] {i, map.get(diff)};
            }
        }
        throw new IllegalArgumentException("no target");
        */

        //One Pass Hashmap
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no target");
    }
}
// @lc code=end

