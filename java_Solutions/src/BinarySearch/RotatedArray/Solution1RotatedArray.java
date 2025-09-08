package BinarySearch.RotatedArray;

public class Solution1RotatedArray {
    public int search(int[] nums, int target) {


        // we need have pointers
        // divide array in mid
        //check for sorted array if yes check target
        // if unsorted update the pointers.

        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            int mid = left + (right - left) /2;

            if (nums[mid] == target) {
                return mid;
            }

            //check if half is sorted

            if (nums[left] <= nums [mid]) { //left is sorted

                if (nums [left] <= target && target < nums[mid]) {
                    right = mid -1;

                } else {
                    left = mid +1;
                }

            }

            else {

                if (nums[mid] < target && target <= nums[right]) {
                    left = mid +1;
                } else {
                    right = mid -1 ;
                }
            }


        }
        return -1;
    }
}
