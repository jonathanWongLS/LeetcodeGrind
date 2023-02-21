/*  
 *  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 *  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 *  typically using all the original letters exactly once.
 */
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            HashMap<Character, Integer> hashMap_S = new HashMap<>(); 
            Character currentChar = null;
            int count = 0;

            // Add count of all characters in string s into HashSet
            for (int i = 0; i < s.length(); i++) {
                currentChar = s.charAt(i);
                if (hashMap_S.containsKey(currentChar)){
                    count = hashMap_S.get(currentChar);
                    hashMap_S.put(currentChar, count + 1);
                }
                else {
                    hashMap_S.put(currentChar, 1);
                }
            } 

            for (int i = 0; i < t.length(); i++) {
                currentChar = t.charAt(i);

                if (hashMap_S.containsKey(currentChar)) {
                    count = hashMap_S.get(currentChar);
                    if (count == 1) {
                        hashMap_S.remove(currentChar);
                    }
                    else {
                        hashMap_S.put(currentChar, count-1);
                    }
                }
                else {
                    return false;
                }

            }

            if (hashMap_S.size() == 0) {
                return true;
            }

        }
        
        return false;
    }
}
