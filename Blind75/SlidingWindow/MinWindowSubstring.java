package Blind75.SlidingWindow;

public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        if (t == "") {
            return "";
        }

        int[] window = new int[128];
        int[] countT = new int[128];

        for (char charT : t.toCharArray()) {
            countT[charT]++;
        }

        int ansLen = Integer.MAX_VALUE;
        int[] ansIndex = {0, 0};
        int have = 0;
        int need = 0;

        int i = 0;
        int j = 0;

        for (int freqT : countT) {
            if (freqT > 0) {
                need++;
            }
        }

        while (j < s.length()) { 
            char currentChar = s.charAt(j);
            window[currentChar]++;
            
            if (countT[currentChar] > 0 && window[currentChar] == countT[currentChar]) {
                have++;
            }

            while (have == need) {
                if (j-i+1 < ansLen) {
                    ansLen = j-i+1;
                    ansIndex[0] = i;
                    ansIndex[1] = j+1; 
                }

                window[s.charAt(i)]--;

                if (countT[s.charAt(i)] > 0 && window[s.charAt(i)] < countT[s.charAt(i)]) {
                    have--;
                }

                i++;
            }

            j++;
        }
        
        if (ansLen != Integer.MAX_VALUE) {
            return s.substring(ansIndex[0], ansIndex[1]);
        }   
        else {
            return "";
        }
    }
}
