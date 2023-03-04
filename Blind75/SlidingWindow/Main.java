package Blind75.SlidingWindow;

public class Main {
    public static void main(String[] args) {
        BestTimeToBuySellStock solution1 = new BestTimeToBuySellStock();
        LongestSubstringWithoutRepeatingCharacters solution2 = new LongestSubstringWithoutRepeatingCharacters();
        RepeatingCharacterReplacement solution3 = new RepeatingCharacterReplacement();

        int[] ar1 = {7,1,5,3,6,4};
        System.out.println("Best Time to Buy and Sell Stock: " + Integer.toString(solution1.maxProfit(ar1)));

        String str1 = "pwwkew";
        System.out.println("Longest Substring Without Repeating Characters: " + Integer.toString(solution2.lengthOfLongestSubstring(str1)));

        String str2 = "ABABBA";
        String str3 = "ABAB";
        String str4 = "AABABBA";
        int k = 1;
        System.out.println("Longest Repeating Character Replacement: " + Integer.toString(solution3.characterReplacement(str4, k)));

    }

}
