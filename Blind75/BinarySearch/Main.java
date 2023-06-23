package Blind75.BinarySearch;

public class Main {
    public static void main(String[] args) {
        MinRotatedSortedArray solution1 = new MinRotatedSortedArray();
        SearchRotatedsortedArray solution2 = new SearchRotatedsortedArray();

        int[] nums1 = {2,1,3};
        System.out.println(solution1.findMin(nums1));

        int[] nums2 = {1,3,5};
        int target = 0;
        System.out.println(solution2.search(nums2, target));

    }
}
