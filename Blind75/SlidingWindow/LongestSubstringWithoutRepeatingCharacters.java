package Blind75.SlidingWindow;
import java.util.HashMap;
import java.lang.Math;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();

        if (stringLength == 0) { 
            return 0;
        }
        else if (stringLength == 1) {
            return 1;
        }

        int maxLength = 0;
        int length = 0;
        int start = 0;
        int end = 0;
        
        HashMap<Character, Integer> characterAndIndex = new HashMap<>();

        while ( (start <= end) && (end < stringLength) ) {
            if (!characterAndIndex.containsKey(s.charAt(end)) ) {
                characterAndIndex.put(s.charAt(end), end);
                length++;
                end++;
                maxLength = Math.max(length, maxLength);
            }
            else {
                if (characterAndIndex.get(s.charAt(end)) >= start){
                    start = characterAndIndex.get(s.charAt(end)) + 1;
                }
                characterAndIndex.put(s.charAt(end), end);
                length = end - start + 1;
                maxLength = Math.max( (end - start + 1), maxLength );                
                end++;
                
            }
            
        }

        return maxLength;   
    }
}
