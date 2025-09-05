package BinarySearch.SimpleBinarySearch;

public class SimpleBinarySearch {

    /**
     *
     * @param nums - already sorted
     * @param target -
     * @return index if found else -1
     */
    public int search(int[] nums, int target) {

        /**
         * we want to get the length of array
         * go the mid element
         * if mid is less than traget serach right
         * else serach left
         *
         * continue till you find the elemt
         */

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;



    }
}
