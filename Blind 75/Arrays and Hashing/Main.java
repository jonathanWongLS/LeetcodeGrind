import java.util.*;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate solution1 = new ContainsDuplicate();
        ValidAnagram solution2 = new ValidAnagram();
        TwoSum solution3 = new TwoSum();
        GroupAnagrams solution4 = new GroupAnagrams();
        TopKFrequentElements solution5 = new TopKFrequentElements();
        ProductOfArrayExceptSelf solution6 = new ProductOfArrayExceptSelf();
        EncodeAndDecode solution7 = new EncodeAndDecode();

        int [] nums = {1,2,3,1};
        System.out.println("Contains Duplicate: " + solution1.containsDuplicate(nums));

        String s = "anagram", t = "nagaram";
        System.out.println("Valid Anagram: "  + solution2.isAnagram(s, t));

        int[] twoSumsNums = {3,2,4};
        int target = 6;
        int[] arraySolution = solution3.twoSum(twoSumsNums, target);
        System.out.println("Two Sum: " + arraySolution[0] + ", " + arraySolution[1]);

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution4.groupAnagrams(strs));

        int[] topKNums = {1,1,1,2,2,3,3};
        int k = 2;
        System.out.println(Arrays.toString(solution5.topKFrequent(topKNums, k)));
        
        int[] nums6 = {1,2,3,4};
        System.out.println(Arrays.toString(solution6.productExceptSelf(nums6)));
        
        List<String> strs7 = Arrays.asList("hey", "ther#$", "me name", "is");
        // String str7 = "4#lin#4#code1##3#you";
        String encodedString = solution7.encode(strs7);
        System.out.println(encodedString);
        System.out.println(solution7.decode(encodedString));
    }

}
