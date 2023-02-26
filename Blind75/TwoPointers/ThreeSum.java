import java.util.*;
import java.util.Arrays;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    threeSumList.add(new ArrayList<>( 
                        Arrays.asList(nums[i], nums[j], nums[k])
                    ));
                    j++;

                    // Avoid duplicate answers by checking if nums at index j has the same value as that at index j-1
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    } 

                }
                else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return threeSumList;
    }
}
