package Blind75.SlidingWindow;

import java.util.HashMap;

public class RepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        int l, r, result, maxFrequency;
        l = r = result = maxFrequency = 0;
        int strLength = s.length();

        for (r = 0;r < strLength; r++) {
            charFrequencyMap.put(s.charAt(r) , charFrequencyMap.getOrDefault(s.charAt(r), 0) + 1);
            maxFrequency = Math.max(maxFrequency, charFrequencyMap.get(s.charAt(r)));

            while ( (r - l + 1) - maxFrequency > k) {
                charFrequencyMap.put(s.charAt(l), charFrequencyMap.get(s.charAt(l))-1);
                l++;
            }

            result = Math.max(result, (r - l + 1) );

        }

        return result;   
    }
}