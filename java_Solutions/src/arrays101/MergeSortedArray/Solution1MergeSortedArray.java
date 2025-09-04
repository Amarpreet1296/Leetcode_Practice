package arrays101.MergeSortedArray;

public class Solution1MergeSortedArray {
    /**
     *
     * @param nums1 has lenth m+n , and m elements
     * @param m - elements in nums1
     * @param nums2 - length n
     *
     *  we want to change nums1 in place while ascending
     *
     *              Time and space - 0(M +N), O(1)
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * Trying 2 pointers, one in nums 1 till m elements
         * And one in nums 2
         * Comparing the elements
         * and adding it back to nums 1
         * also have another pointer in nums 1 to keep track of the elemnt
         *
         */
        int p1 = m - 1;
        int p2 = n - 1;
        int write = m + n - 1;
         while (p1>= 0 && p2 >= 0) {

             if(nums1[p1] > nums2[p2]) {
                 nums1[write] = nums1[p1];
                 p1--;

             }else  {
                 nums1[write] = nums2[p2];
                 p2 --;
             }
             write --;

         }
         // if num1 reaches 0 index first, then we just add the rest of p2 i
         while (p2 >= 0) {
             nums1[write] = nums2[p2];
             p2--;
             write --;

         }


    }
}
