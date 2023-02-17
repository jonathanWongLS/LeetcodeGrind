import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutiveIgnoreRepetition(int[] nums) {
        HashSet<Integer> hashsetInts = new HashSet<>();
        int longestSequenceLength = 0;

        // Enter all list items into hashset
        for (int i = 0; i < nums.length; i++) {
            hashsetInts.add(nums[i]);
        }
        
        //Loop through all integers in list
        for (int i = 0; i < nums.length; i++) {

            // If hashset does not contain (current item - 1), item is the first in the subsequence
            if (!hashsetInts.contains(nums[i] - 1)) {

                // Initialising current integer in the current subsequence we are checking
                int currentItem = nums[i];

                // By iteratively adding 1 to the first number, check how many numbers in the array can be included in that subsequence
                while (hashsetInts.contains(currentItem)) {
                    hashsetInts.remove(currentItem);
                    currentItem++;
                }  

                // Update the longest subsequence length
                if (longestSequenceLength < currentItem - nums[i]) {
                    longestSequenceLength = currentItem - nums[i];
                }
            }
        } 

        return longestSequenceLength;
    }

    public int longestConsecutiveWithRepetition(int[] nums) {
        HashMap<Integer, Integer> hashmapInts = new HashMap<>();
        int longestSequenceLength = 0;
        int currentLength = 0;

        // Enter all list items into hashset
        for (int i = 0; i < nums.length; i++) {
            hashmapInts.put(nums[i], hashmapInts.getOrDefault(nums[i], 0) + 1);
        }

        //Loop through all integers in list
        for (int i = 0; i < nums.length; i++) {

            // If hashset does not contain (current item - 1), item is the first in the subsequence
            if (!hashmapInts.containsKey(nums[i] - 1)) {

                // Initialising current integer in the current subsequence we are checking
                int currentItem = nums[i];

                // By iteratively adding 1 to the first number, check how many numbers in the array can be included in that subsequence
                while (hashmapInts.containsKey(currentItem)) {
                    currentLength += hashmapInts.get(currentItem);
                    hashmapInts.remove(currentItem);
                    currentItem++;
                }  

                // Update the longest subsequence length
                if (longestSequenceLength < currentLength) {
                    longestSequenceLength = currentLength;
                }
            }
        } 

        return longestSequenceLength;
    }
}
