public class Main {
    public static void main(String[] args) {
        ContainsDuplicate solution1 = new ContainsDuplicate();
        ValidAnagram solution2 = new ValidAnagram();

        int []nums = {1,2,3,1};
        System.out.println("Contains Duplicate: " + solution1.containsDuplicate(nums));

        String s = "anagram", t = "nagaram";
        System.out.println("Valid Anagram: "  + solution2.isAnagram(s, t));
    }
}
