package Blind75.BinarySearch;

public class MinRotatedSortedArray {
    public int findMinHelper(int[] nums, int left, int mid, int right){

        if (right - left == 1) {
            return Integer.min(nums[mid], nums[right]);
        }
        
        if (nums[right] > nums[mid]) {
            right = mid;
            mid = ((right-left) / 2) + left;
        }

        if (nums[right] < nums[mid]) {
            left = mid;
            mid = ((right-left) / 2) + left ;
        } 


        return findMinHelper(nums, left, mid, right);
    }

    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        else if (nums.length == 2) {
            return Integer.min(nums[0], nums[1]);
        }

        int mid = nums.length / 2;
        int res = findMinHelper(nums, 0, mid, nums.length-1); 

        return res;   
    }
}
