package Blind75.TwoPointers;

public class Main {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama"; // A palindrome
        String str1a = "a"; // A palindrome
        String str2 = "panini";  // Not a palindrome
        ValidPalindrome solution1 = new ValidPalindrome();
        System.out.println("Valid Palindrome: " + solution1.isPalindrome(str1a));
    }
}
