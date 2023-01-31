public class Main {
    public static void main(String[] args) {
        ContainsDuplicate solution1 = new ContainsDuplicate();
        ValidAnagram solution2 = new ValidAnagram();
        TwoSum solution3 = new TwoSum();

        int [] nums = {1,2,3,1};
        System.out.println("Contains Duplicate: " + solution1.containsDuplicate(nums));

        String s = "anagram", t = "nagaram";
        System.out.println("Valid Anagram: "  + solution2.isAnagram(s, t));

        int[] twoSumsNums = {3,2,4};
        int target = 6;
        int[] arraySolution = solution3.twoSum(twoSumsNums, target);
        System.out.println("Two Sum: " + arraySolution[0] + ", " + arraySolution[1]);
    }
}
