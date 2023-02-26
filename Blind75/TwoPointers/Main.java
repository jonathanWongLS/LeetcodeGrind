public class Main {
    public static void main(String[] args) {
        ValidPalindrome solution1 = new ValidPalindrome();
        ThreeSum solution2 = new ThreeSum();

        String str1 = "A man, a plan, a canal: Panama"; // A palindrome
        String str1a = "a"; // A palindrome
        String str2 = "panini";  // Not a palindrome
        System.out.println("Valid Palindrome: " + solution1.isPalindrome(str1a));

        int[] ar1 = {-1,0,1,2,-1,-4};
        int[] ar2 = {0,1,1};
        int[] ar3 = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println("3 Sum: " + solution2.threeSum(ar3));

    }
}
