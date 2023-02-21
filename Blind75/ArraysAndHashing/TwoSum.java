import java.util.HashMap;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twoSumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (twoSumMap.containsKey(target - nums[i])) {
                return new int[] {twoSumMap.get(target - nums[i]), i};
            }
            twoSumMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
