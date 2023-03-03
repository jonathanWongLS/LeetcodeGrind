package Blind75.SlidingWindow;

public class Main {
    public static void main(String[] args) {
        BestTimeToBuySellStock solution1 = new BestTimeToBuySellStock();
        LongestSubstringWithoutRepeatingCharacters solution2 = new LongestSubstringWithoutRepeatingCharacters();
        
        int[] ar1 = {7,1,5,3,6,4};
        System.out.println("Best Time to Buy and Sell Stock: " + Integer.toString(solution1.maxProfit(ar1)));

        String str1 = "pwwkew";
        System.out.println("Longest Substring Without Repeating Characters: " + Integer.toString(solution2.lengthOfLongestSubstring(str1)));

    }

}
