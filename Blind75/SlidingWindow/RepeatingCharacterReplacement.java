package Blind75.SlidingWindow;

public class RepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] charFrequency = new int[26];
        int l, r, result, maxFrequency;
        l = r = result = maxFrequency = 0;
        int strLength = s.length();

        for (r = 0;r < strLength; r++) {
            charFrequency[s.charAt(r) - 65]++;
            maxFrequency = Math.max(maxFrequency, charFrequency[s.charAt(r) - 65]);

            while ( (r - l + 1) - maxFrequency > k) {
                charFrequency[s.charAt(l) - 65]--;
                l++;
            }

            result = Math.max(result, (r - l + 1) );

        }

        return result;   
    }

}