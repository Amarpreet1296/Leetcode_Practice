package arrays.SquareOfSortedArray;

/**
 * Already given sorted order.
 * We take 2 pointers on each end of the array
 * Square them and add the higher sq to the end of new array
 *
 */

public class TwoPointerSolution {

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];

        int pos = nums.length - 1; // filling the new arr from end

        while (left <= right) { // keep checking until both pointers meet

            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                res[pos] = nums[left] * nums[left];
                left++;
            } else {
                res[pos] = nums[right] * nums[right];
                right--;
            }
            pos--; // move to the next position from the end.
        }

        return res;
    }

}