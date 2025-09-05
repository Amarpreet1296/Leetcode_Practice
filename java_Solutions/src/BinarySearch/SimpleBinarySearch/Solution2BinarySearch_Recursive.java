package BinarySearch.SimpleBinarySearch;

public class Solution2BinarySearch_Recursive {

    public int search(int[] nums, int target) {

        return binarySearchRecursive(nums, target, 0, nums.length - 1);
        }

        public int binarySearchRecursive(int nums[],int target, int left, int right) {

        //base case
            if (left > right) {
                return -1;
            }
            int mid = left + (right - left) / 2;  // to prevent integer overflow
            if (nums[mid] == target) {
                return mid;
            }
            else if(nums[mid]>target) {
                return binarySearchRecursive(nums, target, left, mid - 1);
            }
            else {
                return binarySearchRecursive(nums, target, mid + 1, right);
            }


    }
}
