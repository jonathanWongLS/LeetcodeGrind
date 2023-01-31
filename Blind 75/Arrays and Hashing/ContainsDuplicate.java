/*  Given an integer array nums, return true if any value appears at least twice in the array, 
 *  and return false if every element is distinct.
*/

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i])) {
                return true;
            } else {
                numsSet.add(nums[i]);
            }
        }
        return false;
    }
}